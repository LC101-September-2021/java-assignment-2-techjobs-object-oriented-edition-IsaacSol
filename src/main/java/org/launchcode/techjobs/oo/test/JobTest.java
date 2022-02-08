package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job job3Copy;

    @Before
    public void createJobs() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job3Copy = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        assertTrue(job1.getId() < job2.getId() && job2.getId() < job3.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
//        //Proves name is not set by default
//        assertNull(job2.getName());
        //Proves name is set
//        assertNotNull(job3.getName());
        System.out.println(job3 != null);
        assertTrue("Product tester".equals(job3.getName()));
        assertEquals("Product tester", job3.getName());
        //proves Employer is set
//        assertNotNull(job3.getEmployer().getValue());
        assertTrue("ACME" == job3.getEmployer().getValue());
        assertEquals("ACME", job3.getEmployer().getValue());
        //Proves Location is set
//        assertNotNull(job3.getLocation().getValue());
        assertTrue("Desert" == job3.getLocation().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        //Proves PositionType is set
//        assertNotNull(job3.getPositionType().getValue());
        assertTrue("Quality control" == job3.getPositionType().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        //Proves CoreCompetency is set
//        assertNotNull(job3.getPositionType().getValue());
        assertTrue("Persistence" == job3.getCoreCompetency().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertNotEquals(job3, job3Copy);
    }

    @Test
    public void testJobsToString(){
        assertSame("OOPS! This job does not seem to exist.", job1.toString());
        assertEquals("\nID: " + job3.getId() + "\nName: " + job3.getName() + "\nEmployer: " + job3.getEmployer() + "\nLocation: " + job3.getLocation() + "\nPosition Type: " + job3.getPositionType() + "\nCore Competency: " + job3.getCoreCompetency()+"\n", job3.toString());
    }



}
