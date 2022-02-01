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

    @Before
    public void createJobs() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        assertTrue(job1.getId() < job2.getId() && job2.getId() < job3.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        //Proves name is not set by default
        assertTrue(job2.getName() == null);
        //Proves name is set
        assertNotNull(job3.getName());
        assertTrue(job3.getName() == "Product tester");
        //proves Employer is set
        assertNotNull(job3.getEmployer().getValue());
        assertTrue(job3.getEmployer().getValue() == "Product tester");
        //Proves PositionType is set
        assertNotNull(job3.getPositionType().getValue());
        assertTrue(job3.getPositionType().getValue() == "Quality control");
        //Proves CoreCompetency is set
        assertNotNull(job3.getPositionType().getValue());
        assertTrue(job3.getPositionType().getValue() == "Quality control");
    }


}
