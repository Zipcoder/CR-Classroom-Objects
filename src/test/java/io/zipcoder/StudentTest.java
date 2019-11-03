package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void getNumberOfExamsTakenTest(){
        Student student = new Student("Sandy", "Pham", new Double[] {40.0,50.0});
        Assert.assertEquals(2, (int)student.getNumberOfExamsTaken());
    }

}