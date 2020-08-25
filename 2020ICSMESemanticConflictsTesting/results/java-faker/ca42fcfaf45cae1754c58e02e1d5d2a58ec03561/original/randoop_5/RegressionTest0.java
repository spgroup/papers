import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.util.Locale locale0 = null;
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Internet internet5 = faker0.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        java.lang.Class<?> wildcardClass5 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        java.lang.Class<?> wildcardClass4 = company3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Number number6 = faker0.number();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Code code8 = faker0.code();
        java.lang.Class<?> wildcardClass9 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Internet internet5 = faker0.internet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.App app5 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.App app6 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.App app2 = faker0.app();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Code code7 = faker0.code();
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Name name6 = faker0.name();
        java.lang.Class<?> wildcardClass7 = name6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Internet internet5 = faker0.internet();
        java.lang.Class<?> wildcardClass6 = internet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Name name4 = faker0.name();
        java.lang.Class<?> wildcardClass5 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Company company2 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Code code7 = faker0.code();
        java.lang.String str9 = faker0.regexify("hi!");
        com.github.javafaker.Hacker hacker10 = faker0.hacker();
        java.lang.Class<?> wildcardClass11 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        java.lang.String str6 = faker0.bothify("");
        com.github.javafaker.Internet internet7 = faker0.internet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Finance finance6 = faker0.finance();
        com.github.javafaker.Book book7 = faker0.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Code code4 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Company company6 = faker0.company();
        java.lang.String str8 = faker0.regexify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Business business5 = faker0.business();
        java.lang.String str7 = faker0.numerify("hi!");
        com.github.javafaker.Options options8 = faker0.options();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.String str7 = faker0.letterify("hi!");
        java.lang.String str9 = faker0.numerify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Internet internet8 = faker0.internet();
        com.github.javafaker.Hacker hacker9 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Name name3 = faker0.name();
        java.lang.String str5 = faker0.bothify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Internet internet6 = faker0.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.Name name8 = faker0.name();
        java.lang.String str10 = faker0.bothify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.Color color6 = faker0.color();
        java.lang.Class<?> wildcardClass7 = color6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.numerify("hi!");
        com.github.javafaker.Business business3 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Business business5 = faker0.business();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.numerify("hi!");
        com.github.javafaker.Code code3 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.App app7 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        java.lang.Class<?> wildcardClass5 = finance4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Options options7 = faker0.options();
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Color color9 = faker0.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Code code7 = faker0.code();
        java.lang.String str9 = faker0.regexify("hi!");
        com.github.javafaker.Hacker hacker10 = faker0.hacker();
        com.github.javafaker.Business business11 = faker0.business();
        com.github.javafaker.Hacker hacker12 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        java.lang.String str3 = faker0.numerify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Code code6 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.String str7 = faker0.bothify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.Company company8 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        java.lang.String str4 = faker0.regexify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Code code7 = faker0.code();
        java.lang.String str9 = faker0.regexify("hi!");
        com.github.javafaker.Business business10 = faker0.business();
        com.github.javafaker.Color color11 = faker0.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Number number5 = faker0.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Address address6 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.letterify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Number number6 = faker0.number();
        java.lang.String str8 = faker0.regexify("hi!");
        com.github.javafaker.Color color9 = faker0.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Name name7 = faker0.name();
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime9 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Code code7 = faker0.code();
        java.lang.String str9 = faker0.regexify("");
        com.github.javafaker.Book book10 = faker0.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Code code7 = faker0.code();
        com.github.javafaker.Address address8 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.Code code8 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Business business6 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Options options2 = faker0.options();
        java.lang.String str4 = faker0.bothify("");
        com.github.javafaker.App app5 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.Book book6 = faker0.book();
        com.github.javafaker.Company company7 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem();
        java.lang.String str4 = faker1.regexify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        java.lang.String str6 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        com.github.javafaker.Options options8 = faker0.options();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Number number6 = faker0.number();
        java.lang.String str8 = faker0.regexify("hi!");
        com.github.javafaker.Business business9 = faker0.business();
        com.github.javafaker.Hacker hacker10 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        com.github.javafaker.Address address7 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.bothify("hi!");
        com.github.javafaker.App app7 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Number number6 = faker0.number();
        com.github.javafaker.Code code7 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem();
        java.lang.String str4 = faker1.bothify("hi!");
        com.github.javafaker.App app5 = faker1.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.bothify("");
        java.lang.String str9 = faker0.numerify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Number number7 = faker0.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.regexify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.App app6 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        com.github.javafaker.App app7 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Business business6 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Options options4 = faker0.options();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        java.lang.String str4 = faker0.bothify("hi!");
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.letterify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Address address4 = faker0.address();
        java.lang.Class<?> wildcardClass5 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        java.lang.String str3 = faker0.numerify("hi!");
        java.lang.String str5 = faker0.bothify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.App app6 = faker0.app();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Name name7 = faker0.name();
        java.lang.String str9 = faker0.letterify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Hacker hacker2 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Company company8 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Number number6 = faker0.number();
        java.lang.String str8 = faker0.regexify("hi!");
        com.github.javafaker.Company company9 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.Class<?> wildcardClass4 = hacker3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.App app6 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Business business8 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.DateAndTime dateAndTime9 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Number number3 = faker0.number();
        java.lang.String str5 = faker0.numerify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Name name7 = faker0.name();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Internet internet8 = faker0.internet();
        com.github.javafaker.Name name9 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Internet internet8 = faker0.internet();
        java.lang.String str10 = faker0.letterify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.Company company7 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        com.github.javafaker.Name name9 = faker0.name();
        com.github.javafaker.Book book10 = faker0.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        java.lang.Class<?> wildcardClass5 = hacker4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.String str7 = faker0.letterify("hi!");
        com.github.javafaker.Address address8 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Options options6 = faker0.options();
        java.lang.String str8 = faker0.bothify("hi!");
        com.github.javafaker.Lorem lorem9 = faker0.lorem();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Color color5 = faker0.color();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Business business5 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem();
        java.lang.String str4 = faker1.bothify("hi!");
        com.github.javafaker.Color color5 = faker1.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        java.lang.String str6 = faker0.numerify("");
        com.github.javafaker.Code code7 = faker0.code();
        java.lang.String str9 = faker0.regexify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        java.lang.String str4 = faker0.bothify("hi!");
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        com.github.javafaker.Options options6 = faker0.options();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.bothify("hi!");
        java.lang.String str8 = faker0.bothify("");
        com.github.javafaker.Color color9 = faker0.color();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Business business7 = faker0.business();
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Hacker hacker2 = faker0.hacker();
        java.lang.Class<?> wildcardClass3 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Color color5 = faker0.color();
        java.lang.String str7 = faker0.letterify("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        java.lang.String str9 = faker0.letterify("");
        com.github.javafaker.App app10 = faker0.app();
        com.github.javafaker.Business business11 = faker0.business();
        com.github.javafaker.Code code12 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Book book4 = faker0.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Finance finance6 = faker0.finance();
        java.lang.Class<?> wildcardClass7 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.App app6 = faker0.app();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Number number6 = faker0.number();
        com.github.javafaker.Finance finance7 = faker0.finance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Color color4 = faker0.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        java.lang.String str6 = faker0.regexify("");
        java.lang.String str8 = faker0.bothify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        com.github.javafaker.Book book6 = faker0.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Color color6 = faker0.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Options options6 = faker0.options();
        java.lang.String str8 = faker0.bothify("hi!");
        com.github.javafaker.Business business9 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Number number7 = faker0.number();
        com.github.javafaker.Color color8 = faker0.color();
        java.lang.String str10 = faker0.letterify("hi!");
        com.github.javafaker.Business business11 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Number number9 = faker0.number();
        com.github.javafaker.Name name10 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Number number4 = faker0.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Finance finance6 = faker0.finance();
        com.github.javafaker.Code code7 = faker0.code();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        java.lang.Class<?> wildcardClass7 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.Code code6 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        com.github.javafaker.Name name9 = faker0.name();
        com.github.javafaker.Code code10 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        java.lang.String str9 = faker0.letterify("");
        java.lang.String str11 = faker0.bothify("");
        com.github.javafaker.Lorem lorem12 = faker0.lorem();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Company company7 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Address address9 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Name name3 = faker0.name();
        java.lang.String str5 = faker0.letterify("hi!");
        java.lang.String str7 = faker0.regexify("hi!");
        com.github.javafaker.Hacker hacker8 = faker0.hacker();
        com.github.javafaker.DateAndTime dateAndTime9 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        java.lang.String str9 = faker0.letterify("");
        com.github.javafaker.Name name10 = faker0.name();
        com.github.javafaker.Finance finance11 = faker0.finance();
        java.lang.String str13 = faker0.regexify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        java.lang.String str6 = faker0.numerify("");
        com.github.javafaker.Book book7 = faker0.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Options options7 = faker0.options();
        java.lang.String str9 = faker0.numerify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Name name9 = faker0.name();
        java.lang.String str11 = faker0.numerify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        java.lang.String str7 = faker0.letterify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Business business6 = faker0.business();
        com.github.javafaker.Number number7 = faker0.number();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.App app7 = faker0.app();
        com.github.javafaker.Color color8 = faker0.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Code code6 = faker0.code();
        com.github.javafaker.DateAndTime dateAndTime7 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.String str7 = faker0.numerify("");
        com.github.javafaker.Color color8 = faker0.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Code code7 = faker0.code();
        java.lang.String str9 = faker0.regexify("hi!");
        com.github.javafaker.Business business10 = faker0.business();
        com.github.javafaker.Code code11 = faker0.code();
        com.github.javafaker.App app12 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Address address7 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.numerify("hi!");
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Name name6 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        com.github.javafaker.Code code7 = faker0.code();
        com.github.javafaker.Name name8 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Color color5 = faker0.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        com.github.javafaker.Name name6 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.Class<?> wildcardClass1 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.Color color6 = faker0.color();
        java.lang.String str8 = faker0.numerify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Business business9 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Book book7 = faker0.book();
        java.lang.String str9 = faker0.letterify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Color color5 = faker0.color();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Name name7 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Finance finance2 = faker0.finance();
        java.lang.String str4 = faker0.bothify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Internet internet6 = faker0.internet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        com.github.javafaker.Book book8 = faker0.book();
        com.github.javafaker.Book book9 = faker0.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        com.github.javafaker.Code code7 = faker0.code();
        com.github.javafaker.App app8 = faker0.app();
        com.github.javafaker.Finance finance9 = faker0.finance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Options options6 = faker0.options();
        java.lang.String str8 = faker0.regexify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        java.lang.String str4 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.String str7 = faker0.regexify("");
        com.github.javafaker.App app8 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Address address6 = faker0.address();
        java.lang.String str8 = faker0.regexify("hi!");
        java.lang.String str10 = faker0.bothify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.App app5 = faker0.app();
        java.lang.String str7 = faker0.numerify("hi!");
        java.lang.String str9 = faker0.regexify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Name name7 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.String str7 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Name name9 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        java.lang.String str9 = faker0.letterify("");
        com.github.javafaker.Name name10 = faker0.name();
        com.github.javafaker.Finance finance11 = faker0.finance();
        com.github.javafaker.Address address12 = faker0.address();
        java.lang.String str14 = faker0.numerify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.numerify("");
        com.github.javafaker.Address address8 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.App app5 = faker0.app();
        java.lang.String str7 = faker0.numerify("hi!");
        com.github.javafaker.Address address8 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Finance finance6 = faker0.finance();
        com.github.javafaker.Code code7 = faker0.code();
        com.github.javafaker.Options options8 = faker0.options();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Internet internet6 = faker0.internet();
        java.lang.String str8 = faker0.letterify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        java.lang.String str4 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.String str7 = faker0.regexify("");
        com.github.javafaker.Internet internet8 = faker0.internet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Finance finance7 = faker0.finance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        java.lang.String str9 = faker0.letterify("");
        java.lang.String str11 = faker0.bothify("");
        java.lang.String str13 = faker0.numerify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.String str7 = faker0.numerify("");
        com.github.javafaker.Business business8 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Address address8 = faker0.address();
        java.lang.String str10 = faker0.numerify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Company company7 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem();
        java.lang.String str4 = faker1.regexify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Name name7 = faker0.name();
        com.github.javafaker.Options options8 = faker0.options();
        java.lang.String str10 = faker0.regexify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        java.lang.String str9 = faker0.letterify("");
        com.github.javafaker.Name name10 = faker0.name();
        com.github.javafaker.Finance finance11 = faker0.finance();
        com.github.javafaker.Color color12 = faker0.color();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Options options4 = faker0.options();
        com.github.javafaker.Company company5 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.App app5 = faker0.app();
        java.lang.String str7 = faker0.numerify("hi!");
        com.github.javafaker.Hacker hacker8 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.App app5 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Internet internet8 = faker0.internet();
        java.lang.String str10 = faker0.regexify("");
        java.lang.String str12 = faker0.bothify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Name name9 = faker0.name();
        com.github.javafaker.Options options10 = faker0.options();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.Number number3 = faker0.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.Color color3 = faker0.color();
        java.lang.Class<?> wildcardClass4 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Internet internet8 = faker0.internet();
        com.github.javafaker.Code code9 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        java.lang.String str6 = faker0.letterify("");
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Internet internet6 = faker0.internet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        com.github.javafaker.Business business7 = faker0.business();
        com.github.javafaker.Address address8 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.numerify("hi!");
        java.lang.String str4 = faker0.letterify("");
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Number number6 = faker0.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Name name3 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        java.lang.String str6 = faker0.letterify("");
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Hacker hacker9 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Internet internet7 = faker0.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Finance finance2 = faker1.finance();
        com.github.javafaker.Code code3 = faker1.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        java.lang.String str9 = faker0.letterify("");
        com.github.javafaker.Name name10 = faker0.name();
        com.github.javafaker.Finance finance11 = faker0.finance();
        com.github.javafaker.Color color12 = faker0.color();
        com.github.javafaker.Lorem lorem13 = faker0.lorem();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Name name7 = faker0.name();
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        com.github.javafaker.Options options9 = faker0.options();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        java.lang.String str6 = faker0.bothify("hi!");
        com.github.javafaker.Business business7 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Book book6 = faker0.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Number number7 = faker0.number();
        com.github.javafaker.Code code8 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.String str7 = faker0.numerify("");
        java.lang.String str9 = faker0.regexify("hi!");
        com.github.javafaker.Company company10 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.numerify("hi!");
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Number number4 = faker0.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Options options9 = faker0.options();
        java.lang.String str11 = faker0.numerify("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Lorem lorem1 = faker0.lorem();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        java.lang.String str4 = faker0.bothify("hi!");
        java.lang.String str6 = faker0.regexify("");
        com.github.javafaker.Number number7 = faker0.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Finance finance4 = faker0.finance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        java.lang.String str6 = faker0.letterify("");
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        com.github.javafaker.Finance finance8 = faker0.finance();
        java.lang.String str10 = faker0.numerify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Address address2 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        java.lang.String str4 = faker0.letterify("");
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Hacker hacker2 = faker0.hacker();
        java.lang.String str4 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.Class<?> wildcardClass6 = phoneNumber5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.Finance finance8 = faker0.finance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.App app5 = faker0.app();
        java.lang.String str7 = faker0.numerify("hi!");
        java.lang.Class<?> wildcardClass8 = faker0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Company company5 = faker0.company();
        java.lang.String str7 = faker0.regexify("");
        com.github.javafaker.Book book8 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime9 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        java.lang.String str7 = faker0.numerify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Number number6 = faker0.number();
        java.lang.String str8 = faker0.regexify("hi!");
        com.github.javafaker.Lorem lorem9 = faker0.lorem();
        com.github.javafaker.Options options10 = faker0.options();
        com.github.javafaker.Name name11 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Number number9 = faker0.number();
        com.github.javafaker.DateAndTime dateAndTime10 = faker0.date();
        java.lang.String str12 = faker0.bothify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.Address address8 = faker0.address();
        com.github.javafaker.Hacker hacker9 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Company company6 = faker0.company();
        java.lang.String str8 = faker0.letterify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Finance finance6 = faker0.finance();
        com.github.javafaker.Business business7 = faker0.business();
        java.lang.String str9 = faker0.letterify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Internet internet8 = faker0.internet();
        java.lang.String str10 = faker0.regexify("");
        com.github.javafaker.Book book11 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime12 = faker0.date();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime12);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Number number9 = faker0.number();
        com.github.javafaker.Address address10 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Internet internet5 = faker0.internet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Code code7 = faker0.code();
        java.lang.String str9 = faker0.regexify("hi!");
        com.github.javafaker.Hacker hacker10 = faker0.hacker();
        com.github.javafaker.Business business11 = faker0.business();
        com.github.javafaker.Number number12 = faker0.number();
        java.lang.String str14 = faker0.letterify("");
        com.github.javafaker.Company company15 = faker0.company();
        com.github.javafaker.Name name16 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = faker0.book();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Address address4 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.numerify("hi!");
        java.lang.String str4 = faker0.letterify("");
        java.lang.String str6 = faker0.letterify("hi!");
        com.github.javafaker.Color color7 = faker0.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color7);
    }
}

