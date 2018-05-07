package com.example.user04.qa_testing;

import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by USER04 on 3/15/2018.
 */
public class SecondActivityTest {

    @Rule
    public ActivityTestRule<SecondActivity> nActivityActivityTestRule=new ActivityTestRule<SecondActivity>(SecondActivity.class);
    private SecondActivity mActivity=null;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void LaunchSecondActivityonClick(){
        onView(withId(R.id.btngo)).perform(ViewActions.click());

    }

    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }

}