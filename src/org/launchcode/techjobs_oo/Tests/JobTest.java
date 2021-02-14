package org.launchcode.techjobs_oo.Tests;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.*;
import static junit.framework.AssertionFailedError.*;
public class JobTest {
    Job testJob1;
    Job testJob2;
    Job testJob3;
    Job testJob4;
    Job testJob5;

    @Before
    public void createJobObject(){
        testJob1 = new Job();
        testJob2 = new Job();
    }

    @Test
    public void testSettingJobId(){
        assertFalse(testJob1.getId() == testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob3.getName(), "Product tester");
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality(){
        testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob5 = new Job("Product maker", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob4.getId(), testJob5.getId());
    }

    @Test
    public void testToString(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Boolean expectedA = job.toString().startsWith("\n");
        Boolean expectedB = job.toString().endsWith("\n");
        Boolean compareThis = expectedA == expectedB;









    }




}
