package com.kenzie.practicingforloops;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicationTest {

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

    @Test
    public void test_exerciseOne(){
        Application.exerciseOne();
        assertThat(outContent.toString(), containsString("0 1 2 3 4 5 6 7 8 9"));
    }

    @Test
    public void test_exerciseTwo(){
        Application.exerciseTwo();
        assertThat(outContent.toString(), containsString("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20"));
    }

    @Test
    public void test_exerciseThree(){
        Application.exerciseThree();
        assertThat(outContent.toString(), containsString("2 4 6 8 10 12 14 16 18 20"));
    }

    @Test
    public void test_exerciseFour(){
        Application.exerciseFour();
        assertThat(outContent.toString(), containsString("22 15 10 19 36 2 5 20"));
    }


    @Test
    public void test_exerciseFive(){
        Application.exerciseFive();
        assertThat(outContent.toString(), containsString("15 10 19 2 5"));
    }

    @Test
    public void test_exerciseSix(){
        Application.exerciseSix();
        assertThat(outContent.toString(), containsString("451440000"));
    }

    @Test
    public void test_exerciseSeven(){
        Application.exerciseSeven();
        assertThat(outContent.toString(), containsString("36"));
    }

    @Test
    public void test_exerciseEight(){
        Application.exerciseEight();
        assertThat(outContent.toString(), containsString("22, 15, 10, 19, 36, 20"));
    }

    @Test
    public void runMainWithoutCrashing() {
        boolean crashed = false;
        try {
            Application.main(new String[]{});
        } catch (Exception e) {
            crashed = true;
        }

        assertEquals(false, crashed, "App can run without crashing") ;
    }
}