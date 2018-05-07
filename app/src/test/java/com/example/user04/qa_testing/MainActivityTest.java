package com.example.user04.qa_testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by USER04 on 3/15/2018.
 */
public class MainActivityTest {

    private MainActivity mainActivity = new MainActivity();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testValidation(){
        boolean result=mainActivity.validate("shawki","12345","shawki","1234");
        assertEquals(true,result);
    }
    @After
    public void tearDown() throws Exception {
    }

}