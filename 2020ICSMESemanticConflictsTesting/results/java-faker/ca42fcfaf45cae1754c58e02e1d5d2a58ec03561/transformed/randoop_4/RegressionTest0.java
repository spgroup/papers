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
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Number number4 = faker1.number;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Book book8 = faker6.book();
        faker0.book = book8;
        java.lang.Class<?> wildcardClass10 = book8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = null;
        faker1.business = business2;
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.App app9 = faker6.app;
        faker1.app = app9;
        com.github.javafaker.Book book11 = faker1.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Number number5 = faker1.number();
        java.lang.Class<?> wildcardClass6 = faker1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber2 = faker1.phoneNumber();
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Address address5 = faker4.address();
        faker1.address = address5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Address address5 = faker0.address;
        com.github.javafaker.Business business6 = null;
        faker0.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker8.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = faker8.fakeValuesService;
        com.github.javafaker.App app11 = faker8.app;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker12.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker12.fakeValuesService;
        com.github.javafaker.App app15 = faker12.app;
        faker8.app = app15;
        faker0.app = app15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app15);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Address address5 = faker0.address;
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker2.fakeValuesService;
        com.github.javafaker.Hacker hacker5 = faker2.hacker;
        com.github.javafaker.Book book6 = faker2.book();
        faker0.book = book6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.numerify("hi!");
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options9 = faker8.options();
        faker0.options = options9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Company company5 = faker0.company;
        com.github.javafaker.Internet internet6 = null;
        faker0.internet = internet6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        java.lang.Class<?> wildcardClass4 = name3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.DateAndTime dateAndTime4 = faker1.date();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Name name8 = faker6.name();
        com.github.javafaker.Hacker hacker9 = faker6.hacker();
        com.github.javafaker.Number number10 = faker6.number();
        faker1.number = number10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Options options4 = null;
        faker0.options = options4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Company company5 = faker0.company;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker7.fakeValuesService;
        com.github.javafaker.Hacker hacker10 = faker7.hacker;
        com.github.javafaker.Color color11 = faker7.color();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker12.phoneNumber;
        faker7.phoneNumber = phoneNumber13;
        com.github.javafaker.Address address15 = null;
        faker7.address = address15;
        com.github.javafaker.Code code17 = faker7.code;
        faker6.code = code17;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Name name21 = faker20.name;
        faker6.name = name21;
        faker0.name = name21;
        com.github.javafaker.Code code24 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code24);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber2 = faker1.phoneNumber();
        com.github.javafaker.App app3 = faker1.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker4.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker4.fakeValuesService;
        com.github.javafaker.Hacker hacker7 = faker4.hacker;
        com.github.javafaker.Book book8 = faker4.book();
        com.github.javafaker.Hacker hacker9 = faker4.hacker();
        java.lang.String str11 = faker4.numerify("hi!");
        com.github.javafaker.Business business12 = faker4.business();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker13.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker13.fakeValuesService;
        com.github.javafaker.Hacker hacker16 = faker13.hacker;
        com.github.javafaker.Book book17 = faker13.book();
        com.github.javafaker.Hacker hacker18 = faker13.hacker();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber20 = faker19.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService21 = faker19.fakeValuesService;
        com.github.javafaker.Hacker hacker22 = faker19.hacker;
        com.github.javafaker.Color color23 = faker19.color();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber25 = faker24.phoneNumber;
        faker19.phoneNumber = phoneNumber25;
        com.github.javafaker.Finance finance27 = faker19.finance();
        faker13.finance = finance27;
        faker4.finance = finance27;
        faker0.finance = finance27;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance27);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.numerify("hi!");
        com.github.javafaker.Address address8 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker5.fakeValuesService;
        com.github.javafaker.Hacker hacker8 = faker5.hacker;
        com.github.javafaker.Book book9 = faker5.book();
        com.github.javafaker.Company company10 = faker5.company;
        faker0.company = company10;
        com.github.javafaker.Color color12 = faker0.color();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = null;
        faker0.number = number1;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker3.fakeValuesService;
        com.github.javafaker.Hacker hacker6 = faker3.hacker;
        com.github.javafaker.Color color7 = faker3.color();
        com.github.javafaker.Address address8 = faker3.address;
        com.github.javafaker.Number number9 = faker3.number;
        faker0.number = number9;
        com.github.javafaker.Company company11 = faker0.company();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Number number5 = faker0.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        com.github.javafaker.Finance finance5 = null;
        faker0.finance = finance5;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker7.fakeValuesService;
        com.github.javafaker.Hacker hacker10 = faker7.hacker;
        com.github.javafaker.Book book11 = faker7.book();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker12.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker12.fakeValuesService;
        com.github.javafaker.Hacker hacker15 = faker12.hacker;
        com.github.javafaker.Book book16 = faker12.book();
        com.github.javafaker.Company company17 = faker12.company;
        faker7.company = company17;
        faker0.company = company17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company17);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Company company5 = faker0.company;
        com.github.javafaker.Name name6 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Name name8 = faker6.name();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker9.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = faker9.fakeValuesService;
        com.github.javafaker.App app12 = faker9.app;
        com.github.javafaker.service.RandomService randomService13 = faker9.randomService;
        faker6.randomService = randomService13;
        faker1.randomService = randomService13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Book book4 = faker1.book;
        com.github.javafaker.Internet internet5 = null;
        faker1.internet = internet5;
        com.github.javafaker.Internet internet7 = faker1.internet();
        com.github.javafaker.Number number8 = faker1.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(internet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker1.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker1.fakeValuesService;
        com.github.javafaker.Hacker hacker4 = faker1.hacker;
        com.github.javafaker.Color color5 = faker1.color();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        faker1.phoneNumber = phoneNumber7;
        com.github.javafaker.Address address9 = null;
        faker1.address = address9;
        com.github.javafaker.Code code11 = faker1.code;
        faker0.code = code11;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Name name15 = faker14.name;
        faker0.name = name15;
        com.github.javafaker.Finance finance17 = faker0.finance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance17);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Address address5 = faker0.address;
        com.github.javafaker.Number number6 = faker0.number;
        com.github.javafaker.Name name7 = faker0.name;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.Color color4 = faker0.color;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.RandomService randomService2 = faker1.randomService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = null;
        faker0.dateAndTime = dateAndTime1;
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        com.github.javafaker.Finance finance6 = faker0.finance();
        com.github.javafaker.Business business7 = faker0.business;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        faker0.phoneNumber = phoneNumber6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number9 = null;
        faker8.number = number9;
        com.github.javafaker.Code code11 = faker8.code;
        faker0.code = code11;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Name name16 = faker14.name();
        com.github.javafaker.Number number17 = faker14.number;
        faker0.number = number17;
        com.github.javafaker.PhoneNumber phoneNumber19 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker5.fakeValuesService;
        com.github.javafaker.Hacker hacker8 = faker5.hacker;
        com.github.javafaker.Color color9 = faker5.color();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker10.phoneNumber;
        faker5.phoneNumber = phoneNumber11;
        com.github.javafaker.Address address13 = null;
        faker5.address = address13;
        com.github.javafaker.Code code15 = faker5.code;
        faker4.code = code15;
        faker1.code = code15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Number number4 = faker1.number;
        com.github.javafaker.Internet internet5 = faker1.internet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker4.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker4.fakeValuesService;
        com.github.javafaker.App app7 = faker4.app;
        com.github.javafaker.service.RandomService randomService8 = faker4.randomService;
        faker1.randomService = randomService8;
        com.github.javafaker.Internet internet10 = faker1.internet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Options options6 = faker0.options;
        com.github.javafaker.Code code7 = faker0.code;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.Internet internet4 = faker0.internet;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.regexify("");
        com.github.javafaker.Options options4 = faker1.options();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.Hacker hacker9 = faker6.hacker;
        com.github.javafaker.Color color10 = faker6.color();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber;
        faker6.phoneNumber = phoneNumber12;
        com.github.javafaker.Finance finance14 = faker6.finance();
        faker0.finance = finance14;
        com.github.javafaker.Hacker hacker16 = faker0.hacker();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber18 = faker17.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService19 = faker17.fakeValuesService;
        com.github.javafaker.Hacker hacker20 = faker17.hacker;
        com.github.javafaker.Color color21 = faker17.color();
        com.github.javafaker.Address address22 = faker17.address;
        com.github.javafaker.Business business23 = null;
        faker17.business = business23;
        com.github.javafaker.Color color25 = faker17.color;
        faker0.color = color25;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Address address5 = faker0.address;
        com.github.javafaker.Business business6 = null;
        faker0.business = business6;
        com.github.javafaker.Color color8 = faker0.color;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker0.fakeValuesService;
        com.github.javafaker.Options options10 = faker0.options();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Finance finance5 = faker1.finance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = null;
        faker0.number = number1;
        com.github.javafaker.Code code3 = faker0.code;
        java.lang.String str5 = faker0.letterify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.RandomService randomService2 = faker0.randomService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Address address5 = faker0.address;
        com.github.javafaker.Business business6 = null;
        faker0.business = business6;
        com.github.javafaker.Lorem lorem8 = faker0.lorem;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.Hacker hacker9 = faker6.hacker;
        com.github.javafaker.Color color10 = faker6.color();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber;
        faker6.phoneNumber = phoneNumber12;
        com.github.javafaker.Finance finance14 = faker6.finance();
        faker0.finance = finance14;
        com.github.javafaker.App app16 = faker0.app;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Company company5 = faker0.company;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker7.fakeValuesService;
        com.github.javafaker.Hacker hacker10 = faker7.hacker;
        com.github.javafaker.Color color11 = faker7.color();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker12.phoneNumber;
        faker7.phoneNumber = phoneNumber13;
        com.github.javafaker.Address address15 = null;
        faker7.address = address15;
        com.github.javafaker.Code code17 = faker7.code;
        faker6.code = code17;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Name name21 = faker20.name;
        faker6.name = name21;
        faker0.name = name21;
        com.github.javafaker.Company company24 = faker0.company;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber26 = faker25.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService27 = faker25.fakeValuesService;
        com.github.javafaker.Hacker hacker28 = faker25.hacker;
        faker0.hacker = hacker28;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber32 = faker31.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService33 = faker31.fakeValuesService;
        com.github.javafaker.Hacker hacker34 = faker31.hacker;
        com.github.javafaker.Color color35 = faker31.color();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber37 = faker36.phoneNumber;
        faker31.phoneNumber = phoneNumber37;
        com.github.javafaker.Address address39 = null;
        faker31.address = address39;
        com.github.javafaker.Code code41 = faker31.code;
        faker30.code = code41;
        faker0.code = code41;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code41);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.App app9 = faker6.app;
        faker1.app = app9;
        com.github.javafaker.Lorem lorem11 = null;
        faker1.lorem = lorem11;
        com.github.javafaker.Business business13 = faker1.business;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Business business5 = null;
        faker0.business = business5;
        com.github.javafaker.Hacker hacker7 = faker0.hacker;
        com.github.javafaker.Internet internet8 = null;
        faker0.internet = internet8;
        com.github.javafaker.Lorem lorem10 = faker0.lorem();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.numerify("hi!");
        com.github.javafaker.Internet internet8 = faker0.internet();
        com.github.javafaker.Lorem lorem9 = faker0.lorem;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.App app9 = faker6.app;
        faker1.app = app9;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = faker1.fakeValuesService;
        com.github.javafaker.Address address12 = faker1.address;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Book book4 = faker1.book;
        com.github.javafaker.Internet internet5 = null;
        faker1.internet = internet5;
        com.github.javafaker.App app7 = faker1.app();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Name name10 = faker9.name();
        faker1.name = name10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        faker0.phoneNumber = phoneNumber6;
        com.github.javafaker.Address address8 = null;
        faker0.address = address8;
        com.github.javafaker.Address address10 = faker0.address;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Name name13 = faker12.name;
        com.github.javafaker.Name name14 = faker12.name();
        com.github.javafaker.Book book15 = faker12.book;
        com.github.javafaker.Internet internet16 = null;
        faker12.internet = internet16;
        com.github.javafaker.Business business18 = faker12.business;
        faker0.business = business18;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker0.fakeValuesService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(address10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService20);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        java.lang.String str6 = faker0.letterify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = null;
        faker0.dateAndTime = dateAndTime1;
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Company company6 = faker0.company;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker4.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker4.fakeValuesService;
        com.github.javafaker.App app7 = faker4.app;
        com.github.javafaker.service.RandomService randomService8 = faker4.randomService;
        faker1.randomService = randomService8;
        com.github.javafaker.Color color10 = faker1.color;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        faker0.phoneNumber = phoneNumber6;
        com.github.javafaker.Address address8 = null;
        faker0.address = address8;
        com.github.javafaker.Code code10 = faker0.code;
        com.github.javafaker.Hacker hacker11 = faker0.hacker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        faker0.phoneNumber = phoneNumber6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number9 = null;
        faker8.number = number9;
        com.github.javafaker.Code code11 = faker8.code;
        faker0.code = code11;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Name name16 = faker14.name();
        com.github.javafaker.Number number17 = faker14.number;
        faker0.number = number17;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber20 = faker19.phoneNumber;
        com.github.javafaker.Address address21 = faker19.address;
        faker0.address = address21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address21);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Company company5 = faker0.company;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker7.fakeValuesService;
        com.github.javafaker.Hacker hacker10 = faker7.hacker;
        com.github.javafaker.Color color11 = faker7.color();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker12.phoneNumber;
        faker7.phoneNumber = phoneNumber13;
        com.github.javafaker.Address address15 = null;
        faker7.address = address15;
        com.github.javafaker.Code code17 = faker7.code;
        faker6.code = code17;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Name name21 = faker20.name;
        faker6.name = name21;
        faker0.name = name21;
        com.github.javafaker.Company company24 = faker0.company;
        com.github.javafaker.Lorem lorem25 = faker0.lorem();
        com.github.javafaker.Number number26 = faker0.number;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number26);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        faker0.phoneNumber = phoneNumber6;
        com.github.javafaker.Address address8 = null;
        faker0.address = address8;
        com.github.javafaker.Code code10 = faker0.code;
        com.github.javafaker.Company company11 = faker0.company();
        com.github.javafaker.Business business12 = faker0.business;
        com.github.javafaker.Hacker hacker13 = faker0.hacker;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Options options4 = faker0.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options();
        java.lang.String str3 = faker0.bothify("");
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Name name6 = faker5.name();
        faker0.name = name6;
        com.github.javafaker.Code code8 = faker0.code;
        com.github.javafaker.Address address9 = faker0.address();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        com.github.javafaker.Code code5 = faker0.code();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = null;
        faker0.dateAndTime = dateAndTime1;
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker4.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker4.fakeValuesService;
        com.github.javafaker.Hacker hacker7 = faker4.hacker;
        com.github.javafaker.Book book8 = faker4.book();
        com.github.javafaker.Hacker hacker9 = faker4.hacker();
        java.lang.String str11 = faker4.numerify("hi!");
        com.github.javafaker.Business business12 = faker4.business();
        faker0.business = business12;
        java.lang.String str15 = faker0.numerify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker4.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker4.fakeValuesService;
        com.github.javafaker.App app7 = faker4.app;
        faker0.app = app7;
        com.github.javafaker.Book book9 = faker0.book();
        com.github.javafaker.App app10 = faker0.app();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options();
        java.lang.String str3 = faker0.bothify("");
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Name name6 = faker5.name();
        faker0.name = name6;
        com.github.javafaker.Code code8 = faker0.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Name name11 = faker10.name;
        com.github.javafaker.Name name12 = faker10.name();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker13.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker13.fakeValuesService;
        com.github.javafaker.App app16 = faker13.app;
        com.github.javafaker.service.RandomService randomService17 = faker13.randomService;
        faker10.randomService = randomService17;
        faker0.randomService = randomService17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService17);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        faker0.phoneNumber = phoneNumber6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Address address5 = faker0.address;
        com.github.javafaker.Business business6 = null;
        faker0.business = business6;
        com.github.javafaker.Color color8 = faker0.color;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker10.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker10.fakeValuesService;
        com.github.javafaker.Hacker hacker13 = faker10.hacker;
        com.github.javafaker.Book book14 = faker10.book();
        com.github.javafaker.Company company15 = faker10.company;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber18 = faker17.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService19 = faker17.fakeValuesService;
        com.github.javafaker.Hacker hacker20 = faker17.hacker;
        com.github.javafaker.Color color21 = faker17.color();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber23 = faker22.phoneNumber;
        faker17.phoneNumber = phoneNumber23;
        com.github.javafaker.Address address25 = null;
        faker17.address = address25;
        com.github.javafaker.Code code27 = faker17.code;
        faker16.code = code27;
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Name name31 = faker30.name;
        faker16.name = name31;
        faker10.name = name31;
        com.github.javafaker.Company company34 = faker10.company;
        faker0.company = company34;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company34);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.Address address2 = faker0.address;
        java.lang.String str4 = faker0.bothify("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = null;
        faker0.dateAndTime = dateAndTime1;
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Name name4 = faker0.name();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.numerify("hi!");
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker9.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = faker9.fakeValuesService;
        com.github.javafaker.Hacker hacker12 = faker9.hacker;
        com.github.javafaker.Book book13 = faker9.book();
        com.github.javafaker.Hacker hacker14 = faker9.hacker();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker15.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker15.fakeValuesService;
        com.github.javafaker.Hacker hacker18 = faker15.hacker;
        com.github.javafaker.Color color19 = faker15.color();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber21 = faker20.phoneNumber;
        faker15.phoneNumber = phoneNumber21;
        com.github.javafaker.Finance finance23 = faker15.finance();
        faker9.finance = finance23;
        faker0.finance = finance23;
        java.lang.String str27 = faker0.regexify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        faker0.phoneNumber = phoneNumber6;
        com.github.javafaker.Address address8 = null;
        faker0.address = address8;
        com.github.javafaker.Code code10 = faker0.code;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Name name13 = faker12.name;
        com.github.javafaker.Name name14 = faker12.name();
        com.github.javafaker.DateAndTime dateAndTime15 = faker12.date();
        faker0.dateAndTime = dateAndTime15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options();
        java.lang.String str3 = faker0.bothify("");
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Name name6 = faker5.name();
        faker0.name = name6;
        com.github.javafaker.Code code8 = faker0.code;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options10 = faker9.options();
        java.lang.String str12 = faker9.bothify("");
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number14 = null;
        faker13.number = number14;
        com.github.javafaker.Code code16 = faker13.code;
        faker9.code = code16;
        faker0.code = code16;
        com.github.javafaker.Lorem lorem19 = faker0.lorem();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(lorem19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Hacker hacker6 = faker1.hacker();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options8 = faker7.options();
        java.lang.String str10 = faker7.bothify("");
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Name name13 = faker12.name();
        faker7.name = name13;
        faker1.name = name13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Company company5 = faker0.company;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker7.fakeValuesService;
        com.github.javafaker.Hacker hacker10 = faker7.hacker;
        com.github.javafaker.Color color11 = faker7.color();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker12.phoneNumber;
        faker7.phoneNumber = phoneNumber13;
        com.github.javafaker.Address address15 = null;
        faker7.address = address15;
        com.github.javafaker.Code code17 = faker7.code;
        faker6.code = code17;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Name name21 = faker20.name;
        faker6.name = name21;
        faker0.name = name21;
        com.github.javafaker.Company company24 = faker0.company;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number26 = null;
        faker25.number = number26;
        com.github.javafaker.Code code28 = faker25.code;
        faker0.code = code28;
        com.github.javafaker.Book book30 = faker0.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book30);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker2.fakeValuesService;
        com.github.javafaker.Hacker hacker5 = faker2.hacker;
        com.github.javafaker.Color color6 = faker2.color();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber;
        faker2.phoneNumber = phoneNumber8;
        com.github.javafaker.Finance finance10 = faker2.finance();
        faker1.finance = finance10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker12.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker12.fakeValuesService;
        com.github.javafaker.App app15 = faker12.app;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber17 = faker16.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker16.fakeValuesService;
        com.github.javafaker.App app19 = faker16.app;
        faker12.app = app19;
        com.github.javafaker.Book book21 = faker12.book();
        faker1.book = book21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book21);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        faker0.phoneNumber = phoneNumber6;
        com.github.javafaker.Address address8 = null;
        faker0.address = address8;
        com.github.javafaker.PhoneNumber phoneNumber10 = faker0.phoneNumber;
        com.github.javafaker.Code code11 = faker0.code;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.regexify("");
        com.github.javafaker.Book book4 = faker1.book();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker4.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker4.fakeValuesService;
        com.github.javafaker.App app7 = faker4.app;
        faker0.app = app7;
        com.github.javafaker.Book book9 = faker0.book();
        com.github.javafaker.Finance finance10 = faker0.finance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.numerify("hi!");
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker9.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = faker9.fakeValuesService;
        com.github.javafaker.Hacker hacker12 = faker9.hacker;
        com.github.javafaker.Book book13 = faker9.book();
        com.github.javafaker.Hacker hacker14 = faker9.hacker();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker15.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker15.fakeValuesService;
        com.github.javafaker.Hacker hacker18 = faker15.hacker;
        com.github.javafaker.Color color19 = faker15.color();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber21 = faker20.phoneNumber;
        faker15.phoneNumber = phoneNumber21;
        com.github.javafaker.Finance finance23 = faker15.finance();
        faker9.finance = finance23;
        faker0.finance = finance23;
        com.github.javafaker.Number number26 = faker0.number;
        com.github.javafaker.Options options27 = faker0.options();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options27);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber2 = faker1.phoneNumber();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker3.fakeValuesService;
        com.github.javafaker.Hacker hacker6 = faker3.hacker;
        com.github.javafaker.Book book7 = faker3.book();
        com.github.javafaker.Hacker hacker8 = faker3.hacker();
        java.lang.String str10 = faker3.numerify("hi!");
        com.github.javafaker.Business business11 = faker3.business();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker12.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker12.fakeValuesService;
        com.github.javafaker.Hacker hacker15 = faker12.hacker;
        com.github.javafaker.Book book16 = faker12.book();
        com.github.javafaker.Hacker hacker17 = faker12.hacker();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber19 = faker18.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker18.fakeValuesService;
        com.github.javafaker.Hacker hacker21 = faker18.hacker;
        com.github.javafaker.Color color22 = faker18.color();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber24 = faker23.phoneNumber;
        faker18.phoneNumber = phoneNumber24;
        com.github.javafaker.Finance finance26 = faker18.finance();
        faker12.finance = finance26;
        faker3.finance = finance26;
        faker1.finance = finance26;
        com.github.javafaker.PhoneNumber phoneNumber30 = faker1.phoneNumber;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber30);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.App app9 = faker6.app;
        faker1.app = app9;
        com.github.javafaker.Lorem lorem11 = null;
        faker1.lorem = lorem11;
        com.github.javafaker.Options options13 = faker1.options();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.Hacker hacker9 = faker6.hacker;
        com.github.javafaker.Color color10 = faker6.color();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber;
        faker6.phoneNumber = phoneNumber12;
        com.github.javafaker.Finance finance14 = faker6.finance();
        faker0.finance = finance14;
        com.github.javafaker.Hacker hacker16 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber17 = faker0.phoneNumber;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber17);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.App app6 = faker0.app;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker1.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker1.fakeValuesService;
        com.github.javafaker.Hacker hacker4 = faker1.hacker;
        com.github.javafaker.Color color5 = faker1.color();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        faker1.phoneNumber = phoneNumber7;
        com.github.javafaker.Address address9 = null;
        faker1.address = address9;
        com.github.javafaker.Code code11 = faker1.code;
        faker0.code = code11;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Name name15 = faker14.name;
        faker0.name = name15;
        com.github.javafaker.Finance finance17 = faker0.finance;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance17);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.App app9 = faker6.app;
        faker1.app = app9;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker11.fakeValuesService;
        com.github.javafaker.Hacker hacker14 = faker11.hacker;
        com.github.javafaker.Hacker hacker15 = faker11.hacker();
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Book book19 = faker17.book();
        faker11.book = book19;
        faker1.book = book19;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber23 = faker22.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker22.fakeValuesService;
        com.github.javafaker.Hacker hacker25 = faker22.hacker;
        com.github.javafaker.Color color26 = faker22.color();
        com.github.javafaker.Address address27 = faker22.address;
        faker1.address = address27;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address27);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.App app9 = faker6.app;
        faker1.app = app9;
        com.github.javafaker.Lorem lorem11 = null;
        faker1.lorem = lorem11;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.PhoneNumber phoneNumber15 = faker14.phoneNumber();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber17 = faker16.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker16.fakeValuesService;
        com.github.javafaker.Hacker hacker19 = faker16.hacker;
        com.github.javafaker.Hacker hacker20 = faker16.hacker();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Name name23 = faker22.name;
        com.github.javafaker.Book book24 = faker22.book();
        faker16.book = book24;
        faker14.book = book24;
        com.github.javafaker.Internet internet27 = faker14.internet();
        faker1.internet = internet27;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet27);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number2 = faker1.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.Hacker hacker9 = faker6.hacker;
        com.github.javafaker.Color color10 = faker6.color();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber;
        faker6.phoneNumber = phoneNumber12;
        com.github.javafaker.Finance finance14 = faker6.finance();
        faker0.finance = finance14;
        com.github.javafaker.App app16 = faker0.app;
        com.github.javafaker.PhoneNumber phoneNumber17 = faker0.phoneNumber;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber17);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker5.fakeValuesService;
        com.github.javafaker.Hacker hacker8 = faker5.hacker;
        com.github.javafaker.Book book9 = faker5.book();
        com.github.javafaker.Company company10 = faker5.company;
        faker0.company = company10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker12.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker12.fakeValuesService;
        com.github.javafaker.Hacker hacker15 = faker12.hacker;
        com.github.javafaker.Book book16 = faker12.book();
        com.github.javafaker.Company company17 = faker12.company;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber20 = faker19.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService21 = faker19.fakeValuesService;
        com.github.javafaker.Hacker hacker22 = faker19.hacker;
        com.github.javafaker.Color color23 = faker19.color();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber25 = faker24.phoneNumber;
        faker19.phoneNumber = phoneNumber25;
        com.github.javafaker.Address address27 = null;
        faker19.address = address27;
        com.github.javafaker.Code code29 = faker19.code;
        faker18.code = code29;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Name name33 = faker32.name;
        faker18.name = name33;
        faker12.name = name33;
        com.github.javafaker.Company company36 = faker12.company;
        faker0.company = company36;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company36);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker2.fakeValuesService;
        com.github.javafaker.Hacker hacker5 = faker2.hacker;
        com.github.javafaker.Color color6 = faker2.color();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber;
        faker2.phoneNumber = phoneNumber8;
        com.github.javafaker.Finance finance10 = faker2.finance();
        com.github.javafaker.DateAndTime dateAndTime11 = faker2.dateAndTime;
        faker0.dateAndTime = dateAndTime11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = null;
        faker0.dateAndTime = dateAndTime1;
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Company company6 = faker0.company;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = null;
        faker0.dateAndTime = dateAndTime1;
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Business business5 = faker0.business();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Business business5 = null;
        faker0.business = business5;
        com.github.javafaker.Hacker hacker7 = faker0.hacker;
        com.github.javafaker.Internet internet8 = null;
        faker0.internet = internet8;
        com.github.javafaker.Color color10 = faker0.color;
        com.github.javafaker.Hacker hacker11 = faker0.hacker;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.numerify("hi!");
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker9.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = faker9.fakeValuesService;
        com.github.javafaker.Hacker hacker12 = faker9.hacker;
        com.github.javafaker.Book book13 = faker9.book();
        com.github.javafaker.Hacker hacker14 = faker9.hacker();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker15.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker15.fakeValuesService;
        com.github.javafaker.Hacker hacker18 = faker15.hacker;
        com.github.javafaker.Color color19 = faker15.color();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber21 = faker20.phoneNumber;
        faker15.phoneNumber = phoneNumber21;
        com.github.javafaker.Finance finance23 = faker15.finance();
        faker9.finance = finance23;
        faker0.finance = finance23;
        com.github.javafaker.Number number26 = faker0.number;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber28 = faker27.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService29 = faker27.fakeValuesService;
        com.github.javafaker.Hacker hacker30 = faker27.hacker;
        com.github.javafaker.Color color31 = faker27.color();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber33 = faker32.phoneNumber;
        faker27.phoneNumber = phoneNumber33;
        com.github.javafaker.Address address35 = null;
        faker27.address = address35;
        com.github.javafaker.PhoneNumber phoneNumber37 = faker27.phoneNumber;
        faker0.phoneNumber = phoneNumber37;
        java.lang.String str40 = faker0.numerify("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.Hacker hacker9 = faker6.hacker;
        com.github.javafaker.Color color10 = faker6.color();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber;
        faker6.phoneNumber = phoneNumber12;
        com.github.javafaker.Address address14 = null;
        faker6.address = address14;
        com.github.javafaker.Code code16 = faker6.code;
        com.github.javafaker.Company company17 = faker6.company();
        faker0.company = company17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company17);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        faker0.phoneNumber = phoneNumber6;
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Number number9 = faker0.number;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(finance8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker4.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker4.fakeValuesService;
        com.github.javafaker.App app7 = faker4.app;
        faker0.app = app7;
        com.github.javafaker.Book book9 = faker0.book();
        com.github.javafaker.Book book10 = faker0.book;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber;
        faker0.phoneNumber = phoneNumber6;
        com.github.javafaker.Address address8 = null;
        faker0.address = address8;
        com.github.javafaker.Code code10 = faker0.code;
        com.github.javafaker.Internet internet11 = null;
        faker0.internet = internet11;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker13.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker13.fakeValuesService;
        com.github.javafaker.Hacker hacker16 = faker13.hacker;
        com.github.javafaker.Color color17 = faker13.color();
        com.github.javafaker.Address address18 = faker13.address;
        com.github.javafaker.Business business19 = null;
        faker13.business = business19;
        com.github.javafaker.Color color21 = faker13.color;
        faker0.color = color21;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker0.phoneNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber23);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = null;
        faker0.number = number1;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime4 = null;
        faker3.dateAndTime = dateAndTime4;
        com.github.javafaker.PhoneNumber phoneNumber6 = faker3.phoneNumber();
        com.github.javafaker.Number number7 = faker3.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker3.fakeValuesService;
        com.github.javafaker.Code code9 = faker3.code();
        com.github.javafaker.Company company10 = faker3.company();
        faker0.company = company10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.numerify("hi!");
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker8.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = faker8.fakeValuesService;
        com.github.javafaker.Hacker hacker11 = faker8.hacker;
        com.github.javafaker.Book book12 = faker8.book();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker13.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker13.fakeValuesService;
        com.github.javafaker.Hacker hacker16 = faker13.hacker;
        com.github.javafaker.Book book17 = faker13.book();
        com.github.javafaker.Company company18 = faker13.company;
        faker8.company = company18;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber21 = faker20.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker20.fakeValuesService;
        com.github.javafaker.Hacker hacker23 = faker20.hacker;
        com.github.javafaker.Book book24 = faker20.book();
        com.github.javafaker.Company company25 = faker20.company;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber28 = faker27.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService29 = faker27.fakeValuesService;
        com.github.javafaker.Hacker hacker30 = faker27.hacker;
        com.github.javafaker.Color color31 = faker27.color();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber33 = faker32.phoneNumber;
        faker27.phoneNumber = phoneNumber33;
        com.github.javafaker.Address address35 = null;
        faker27.address = address35;
        com.github.javafaker.Code code37 = faker27.code;
        faker26.code = code37;
        java.util.Random random39 = null;
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random39);
        com.github.javafaker.Name name41 = faker40.name;
        faker26.name = name41;
        faker20.name = name41;
        com.github.javafaker.Company company44 = faker20.company;
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number46 = null;
        faker45.number = number46;
        com.github.javafaker.Code code48 = faker45.code;
        faker20.code = code48;
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber51 = faker50.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService52 = faker50.fakeValuesService;
        com.github.javafaker.Hacker hacker53 = faker50.hacker;
        com.github.javafaker.Book book54 = faker50.book();
        com.github.javafaker.Hacker hacker55 = faker50.hacker();
        java.lang.String str57 = faker50.numerify("hi!");
        com.github.javafaker.Internet internet58 = faker50.internet();
        faker20.internet = internet58;
        faker8.internet = internet58;
        faker0.internet = internet58;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet58);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.App app9 = faker6.app;
        faker1.app = app9;
        com.github.javafaker.Lorem lorem11 = null;
        faker1.lorem = lorem11;
        java.lang.String str14 = faker1.regexify("");
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker1.fakeValuesService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        com.github.javafaker.Finance finance5 = null;
        faker0.finance = finance5;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Name name10 = faker8.name();
        com.github.javafaker.DateAndTime dateAndTime11 = faker8.date();
        faker0.dateAndTime = dateAndTime11;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker13.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker13.fakeValuesService;
        com.github.javafaker.App app16 = faker13.app;
        faker0.app = app16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(randomService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.Address address2 = faker0.address;
        com.github.javafaker.Internet internet3 = faker0.internet;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(address2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(internet3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker2.fakeValuesService;
        com.github.javafaker.App app5 = faker2.app;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.App app9 = faker6.app;
        faker2.app = app9;
        com.github.javafaker.Book book11 = faker2.book();
        faker0.book = book11;
        com.github.javafaker.Company company13 = faker0.company;
        com.github.javafaker.Company company14 = faker0.company;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(company14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name2 = faker1.name;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker6.fakeValuesService;
        com.github.javafaker.App app9 = faker6.app;
        faker1.app = app9;
        com.github.javafaker.Lorem lorem11 = null;
        faker1.lorem = lorem11;
        java.lang.String str14 = faker1.regexify("");
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Name name18 = faker16.name();
        com.github.javafaker.Hacker hacker19 = faker16.hacker();
        com.github.javafaker.Number number20 = faker16.number();
        faker1.number = number20;
        com.github.javafaker.DateAndTime dateAndTime22 = faker1.dateAndTime;
        com.github.javafaker.Business business23 = faker1.business;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateAndTime22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(business23);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.App app3 = faker0.app;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker4.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker4.fakeValuesService;
        com.github.javafaker.App app7 = faker4.app;
        faker0.app = app7;
        com.github.javafaker.Number number9 = faker0.number();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(app7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker3 = faker0.hacker;
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Business business5 = null;
        faker0.business = business5;
        com.github.javafaker.Hacker hacker7 = faker0.hacker;
        com.github.javafaker.Internet internet8 = null;
        faker0.internet = internet8;
        com.github.javafaker.Color color10 = faker0.color;
        com.github.javafaker.Name name11 = faker0.name;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fakeValuesService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hacker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number5 = null;
        faker4.number = number5;
        com.github.javafaker.Code code7 = faker4.code;
        faker0.code = code7;
        java.lang.String str10 = faker0.bothify("hi!");
        com.github.javafaker.Book book11 = faker0.book;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(code7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Options options1 = faker0.options();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Name name6 = faker4.name();
        faker0.name = name6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(options1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(phoneNumber2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(name6);
    }
}

