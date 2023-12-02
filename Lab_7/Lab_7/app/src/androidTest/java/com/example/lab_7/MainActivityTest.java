package com.example.lab_7;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import android.widget.TextView;

import androidx.test.annotation.UiThreadTest;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);
    // private MainActivity mActivity = new MainActivity();
    private TextView text;

    @Before
    public void setUp() throws Exception {
        // ActivityScenario<MainActivity> scenario = mActivityTestRule.getScenario();
    }

    @Test
    @UiThreadTest
    public void checkFirstName() throws Exception {
        // Retrieve the activity using the testing framework.
        mActivityTestRule.getScenario().onActivity(activity -> {
            // Use activity.findViewById to find the view.
            assertNotNull(activity.findViewById(R.id.textView1));
            text = activity.findViewById(R.id.username);
            text.setText("user1");
            String name = text.getText().toString();
            assertNotEquals("user", name);
        });

    }
}