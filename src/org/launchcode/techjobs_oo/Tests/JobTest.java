package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertFalse;


public class JobTest {
    Job testJob1;
    Job testJob2;

    @Before
    public void createJobObject(){
        testJob1 = new Job();
        testJob2 = new Job();


    }

    @Test
    public void testSettingJobId(){
        assertFalse(testJob1.getId() == testJob2.getId());
    }




}
