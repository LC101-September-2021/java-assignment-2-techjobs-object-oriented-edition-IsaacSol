package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
//    Job job;
    Job job1;
    Job job2;
    Job job3;
    Job job3Copy;

    @Before
    public void createJobs() {
//        job = new Job();
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job3Copy = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
//        assertTrue(job1.getId() < job2.getId() && job2.getId() < job3.getId());
        Job job6 = new Job();
        Job job7 = new Job();
        assertTrue(job6.getId() > 0);
        assertTrue(job7.getId() > 0);
    }

    @Test
    public void testJobConstructorSetsAllFieldsExists() {
        //Proves name is set
        assertNotNull(job3.getName());
        //proves Employer is set
        assertNotNull(job3.getEmployer().getValue());
        //Proves Location is set
        assertNotNull(job3.getLocation().getValue());
        //Proves PositionType is set
        assertNotNull(job3.getPositionType().getValue());
        //Proves CoreCompetency is set
        assertNotNull(job3.getPositionType().getValue());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        //Proves name is not set by default
//        assertNull(job2.getName());

//        System.out.println(job3 != null);
        Assert.assertTrue("Product tester" == job4.getName());
        Assert.assertEquals("Product tester", job4.getName());

        Assert.assertTrue("ACME" == job4.getEmployer().getValue());
        Assert.assertEquals("ACME", job4.getEmployer().getValue());

        Assert.assertTrue("Desert" == job4.getLocation().getValue());
        Assert.assertEquals("Desert", job4.getLocation().getValue());

        Assert.assertTrue("Quality control" == job4.getPositionType().getValue());
        Assert.assertEquals("Quality control", job4.getPositionType().getValue());

        Assert.assertTrue("Persistence" == job4.getCoreCompetency().getValue());
        Assert.assertEquals("Persistence", job4.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5Copy = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job5.equals(job5Copy));
    }

    @Test
    public void testJobsToString(){
        assertSame("\nOOPS! This job does not seem to exist.\n", job1.toString());
        assertEquals("\nID: " + job3.getId() + "\nName: " + job3.getName() + "\nEmployer: " + job3.getEmployer() + "\nLocation: " + job3.getLocation() + "\nPosition Type: " + job3.getPositionType() + "\nCore Competency: " + job3.getCoreCompetency()+"\n", job3.toString());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job8 = new Job();
        char test = '\n';
        System.out.println(job8);
        assertEquals(job8.toString().charAt(0), test);
        assertEquals(job8.toString().charAt(job8.toString().length() - 1), test);
    }


    @Test
    public void testToStringHandlesEmptyField() {
        Job job7 = new Job();
        Assert.assertEquals("\nOOPS! This job does not seem to exist.\n", job7.toString());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(job.toString());
        assertEquals("\nID: " + job.getId() + "\nName: " + job.getName() + "\nEmployer: " + job.getEmployer() + "\nLocation: " + job.getLocation() + "\nPosition Type: " + job.getPositionType() + "\nCore Competency: " + job.getCoreCompetency()+"\n", job.toString());

    }


}
