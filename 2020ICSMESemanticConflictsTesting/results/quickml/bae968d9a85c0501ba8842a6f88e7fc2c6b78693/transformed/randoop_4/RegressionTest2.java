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
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

