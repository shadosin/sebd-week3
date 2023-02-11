package com.kenzie.practicingforloops;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.InvocationInterceptor;
import org.junit.jupiter.api.extension.ReflectiveInvocationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.time.Duration;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicationTest {

    private int TestTimeOut = 5;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @BeforeEach
    public void setTestInput() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Order(0)
    @Test
    public void test_exerciseOne(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.exerciseOne();
            assertThat(outContent.toString(), containsString("0 1 2 3 4 5 6 7 8 9"));
        });
    }

    @Order(1)
    @Test
    public void test_exerciseTwo(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.exerciseTwo();
            assertThat(outContent.toString(), containsString("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20"));
        });
    }

    @Order(2)
    @Test
    public void test_exerciseThree(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.exerciseThree();
            assertThat(outContent.toString(), containsString("2 4 6 8 10 12 14 16 18 20"));
        });
    }

    @Order(3)
    @Test
    public void test_exerciseFour(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.exerciseFour();
            assertThat(outContent.toString(), containsString("22 15 10 19 36 2 5 20"));
        });
    }

    @Order(4)
    @Test
    public void test_exerciseFive(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.exerciseFive();
            assertThat(outContent.toString(), containsString("15 10 19 2 5"));
        });
    }

    @Order(5)
    @Test
    public void test_exerciseSix(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            assertThat(outContent.toString(), containsString("451440000"));
        });
    }

    @Order(6)
    @Test
    public void test_exerciseSeven(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.exerciseSeven();
            assertThat(outContent.toString(), containsString("36"));
        });
    }

    @Order(7)
    @Test
    public void test_exerciseEight(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.exerciseEight();
            assertThat(outContent.toString(), containsString("22, 15, 10, 19, 36, 20"));
        });
    }

    @Order(8)
    @Test
    public void runMainWithoutCrashing() {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            boolean crashed = false;
            try {
                Application.main(new String[]{});
            } catch (Exception e) {
                crashed = true;
            }

            assertEquals(false, crashed, "App can run without crashing") ;
        });
    }

    public class PreemptiveTimeoutInvocationInterceptor implements InvocationInterceptor {
        @Override
        public void interceptTestMethod(Invocation<Void> invocation, ReflectiveInvocationContext<Method> invocationContext, ExtensionContext extensionContext) {
            Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), invocation::proceed);
        }
    }
}