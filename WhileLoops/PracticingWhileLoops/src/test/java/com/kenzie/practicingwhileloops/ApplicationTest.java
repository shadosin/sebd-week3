package com.kenzie.practicingwhileloops;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

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
        assertThat(outContent.toString(), containsString("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15"));
    }

    @Test
    public void test_exerciseThree(){
        Application.exerciseThree();
        assertThat(outContent.toString(), containsString("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20"));
    }

    @Test
    public void test_exerciseFour(){
        Application.exerciseFour();
        assertThat(outContent.toString(), containsString("2 4 6 8 10 12 14 16 18 20"));
    }


    @Test
    public void test_exerciseFive(){
        Application.exerciseFive();
        assertThat(outContent.toString(), containsString("1 3 5 7 9 11 13 15 17 19"));
    }

    @Test
    public void test_exerciseSix(){
        Application.exerciseSix();
        assertThat(outContent.toString(), containsString("5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100"));
    }

    @Test
    public void test_exerciseSeven(){
        Application.exerciseSeven();
        assertThat(outContent.toString(), containsString("20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1"));
    }

    @Test
    public void test_exerciseEight(){
        Application.exerciseEight();
        assertThat(outContent.toString(), containsString("20 18 16 14 12 10 8 6 4 2"));
    }
    @Test
    public void test_exerciseNine(){
        Application.exerciseNine();
        assertThat(outContent.toString(), containsString("19 17 15 13 11 9 7 5 3 1"));
    }

    @Test
    public void test_exerciseTen(){
        Application.exerciseTen();
        assertThat(outContent.toString(), containsString("100 95 90 85 80 75 70 65 60 55 50 45 40 35 30 25 20 15 10 5"));
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