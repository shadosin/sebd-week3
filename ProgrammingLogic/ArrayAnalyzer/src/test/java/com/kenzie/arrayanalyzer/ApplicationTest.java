package com.kenzie.arrayanalyzer;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.InvocationInterceptor;
import org.junit.jupiter.api.extension.ReflectiveInvocationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.time.Duration;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

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
    public void test_Largest1(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472 });
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Largest Number: 588")));
            assertThat(outContent.toString(), containsString("Largest Number: 940"));
        });
    }

    @Order(1)
    @Test
    public void test_Smallest1(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472 });
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Smallest Number: 44")));
            assertThat(outContent.toString(), containsString("Smallest Number: 20"));
        });
    }

    @Order(2)
    @Test
    public void test_Sum1(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472 });
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Sum: 2510")));
            assertThat(outContent.toString(), containsString("Sum: 9096"));
        });
    }

    @Order(3)
    @Test
    public void test_Average1(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472 });
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Average: 278.8888888888889")));
            assertThat(outContent.toString(), containsString("Average: 454.8"));
        });
    }

    @Order(4)
    @Test
    public void test_EvenNumbers1(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472 });
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Even Numbers: [300, 44, 588, 422, 88]")));
            assertThat(outContent.toString(), containsString("Even Numbers: [244, 758, 450, 302, 20, 712, 456, 398, 882, 848, 940, 472]"));
        });
    }

    @Order(5)
    @Test
    public void test_OddNumbers1(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472 });
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Odd Numbers: [299, 189, 209, 371]")));
            assertThat(outContent.toString(), containsString("Odd Numbers: [469, 755, 245, 71, 21, 339, 179, 535]"));
        });
    }

    @Order(6)
    @Test
    public void test_NumbersDivisibleByEight1(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472 });
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Numbers divisible by 8: [88]")));
            assertThat(outContent.toString(), containsString("Numbers divisible by 8: [712, 456, 848, 472]"));
        });
    }

    @Order(7)
    @Test
    public void test_Largest2(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 299, 300, 189, 44, 209, 588, 422, 371, 88});
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Largest Number: 940")));
            assertThat(outContent.toString(), containsString("Largest Number: 588"));
        });
    }

    @Order(8)
    @Test
    public void test_Smallest2(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 299, 300, 189, 44, 209, 588, 422, 371, 88});
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Smallest Number: 20")));
            assertThat(outContent.toString(), containsString("Smallest Number: 44"));
        });
    }

    @Order(9)
    @Test
    public void test_Sum2(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 299, 300, 189, 44, 209, 588, 422, 371, 88});
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Sum: 9096")));
            assertThat(outContent.toString(), containsString("Sum: 2510"));
        });
    }

    @Order(10)
    @Test
    public void test_Average2(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 299, 300, 189, 44, 209, 588, 422, 371, 88});
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Average: 454.8")));
            assertThat(outContent.toString(), containsString("Average: 278.8888888888889"));
        });
    }

    @Order(11)
    @Test
    public void test_EvenNumbers2(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 299, 300, 189, 44, 209, 588, 422, 371, 88});
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Even Numbers: [244, 758, 450, 302, 20, 712, 456, 398, 882, 848, 940, 472]")));
            assertThat(outContent.toString(), containsString("Even Numbers: [300, 44, 588, 422, 88]"));
        });
    }

    @Order(12)
    @Test
    public void test_OddNumbers2(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 299, 300, 189, 44, 209, 588, 422, 371, 88});
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Odd Numbers: [469, 755, 245, 71, 21, 339, 179, 535]")));
            assertThat(outContent.toString(), containsString("Odd Numbers: [299, 189, 209, 371]"));
        });
    }

    @Order(13)
    @Test
    public void test_NumbersDivisibleByEight2(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestTimeOut), () -> {
            Application.arrayAnalyzer(new int[]{ 299, 300, 189, 44, 209, 588, 422, 371, 88});
            assertThat("Answer from another test contained here", outContent.toString(), not(containsString("Numbers divisible by 8: [712, 456, 848, 472]")));
            assertThat(outContent.toString(), containsString("Numbers divisible by 8: [88]"));
        });
    }

    public class PreemptiveTimeoutInvocationInterceptor implements InvocationInterceptor {
        @Override
        public void interceptTestMethod(Invocation<Void> invocation, ReflectiveInvocationContext<Method> invocationContext, ExtensionContext extensionContext) {
            Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), invocation::proceed);
        }
    }
}