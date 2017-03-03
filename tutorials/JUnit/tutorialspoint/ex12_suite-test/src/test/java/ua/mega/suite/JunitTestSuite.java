package ua.mega.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PrintMessageTest.class,
        SalutationMessageTest.class
})

public class JunitTestSuite {
}
