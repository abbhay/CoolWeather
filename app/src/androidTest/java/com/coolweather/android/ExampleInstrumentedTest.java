<<<<<<< HEAD
package com.coolweather.android;
=======
package com.example.android;
>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

<<<<<<< HEAD
        assertEquals("com.coolweather.android", appContext.getPackageName());
=======
        assertEquals("com.example.coolweather", appContext.getPackageName());
>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284
    }
}
