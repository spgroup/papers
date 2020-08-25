import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker3.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface6 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService2, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService5);
        // Checks the contract:  fakeValuesServiceInterface6.equals(fakeValuesServiceInterface6)
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface6.equals(fakeValuesServiceInterface6)", fakeValuesServiceInterface6.equals(fakeValuesServiceInterface6));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
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
        com.github.javafaker.DateAndTime dateAndTime11 = null;
        faker10.dateAndTime = dateAndTime11;
        com.github.javafaker.PhoneNumber phoneNumber13 = faker10.phoneNumber();
        com.github.javafaker.Number number14 = faker10.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = faker10.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface16 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService9, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService15);
        // Checks the contract:  fakeValuesServiceInterface16.equals(fakeValuesServiceInterface16)
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface16.equals(fakeValuesServiceInterface16)", fakeValuesServiceInterface16.equals(fakeValuesServiceInterface16));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker0.fakeValuesService;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Name name6 = faker4.name();
        com.github.javafaker.Hacker hacker7 = faker4.hacker();
        com.github.javafaker.Number number8 = faker4.number();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker9.phoneNumber;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = faker9.fakeValuesService;
        com.github.javafaker.App app12 = faker9.app;
        faker4.app = app12;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker4.fakeValuesService;
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface15 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService2, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService14);
        // Checks the contract:  fakeValuesServiceInterface15.equals(fakeValuesServiceInterface15)
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface15.equals(fakeValuesServiceInterface15)", fakeValuesServiceInterface15.equals(fakeValuesServiceInterface15));
    }
}

