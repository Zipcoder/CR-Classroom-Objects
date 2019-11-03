package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassroomTest {
    private Classroom presetRoom;
    private Classroom presetRoomWithStudent;
    private Classroom presetRoomMultipleStudents;
    private final double DELTA = 0.001;
    private Student[] presetStudent = new Student[]{
            new Student("Phamdy", "Sand", new Double[]{90.0, 89.0}),
            new Student("Sandy", "Pham", new Double[]{99.0, 95.0, 91.0}),
            new Student("Sandicus", "Phamicus", null)
    };

    @Before
    public void settings() {
        presetRoomWithStudent = new Classroom(presetStudent);
        presetRoomMultipleStudents = new Classroom(10);
        presetRoom = new Classroom();

        presetRoomMultipleStudents.addStudent(presetStudent[0]);
        presetRoomMultipleStudents.addStudent(presetStudent[1]);
    }
    @Test
    public void getAverageExamScoreMultiple(){
        Assert.assertEquals(92.25, presetRoomMultipleStudents.getAverageExamScore(), DELTA);
    }
    @Test
    public void getAverageExamScorePresetStudent(){
        Assert.assertEquals(92.25, presetRoomWithStudent.getAverageExamScore(), DELTA);
    }
    @Test
    public void addStudentPresetRoom(){
        presetRoom.addStudent(presetStudent[0]);
        Assert.assertEquals(presetRoom.getStudents()[0], presetStudent[0]);
    }
}