package com.ironhack.school.repository;

import com.ironhack.school.model.Course;
import com.ironhack.school.model.Grade;
import com.ironhack.school.model.Section;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GradeRepositoryTest {

    @Autowired
    GradeRepository gradeRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    SectionRepository sectionRepository;

    private List<Course> courses;
    private List<Section> sections;
    private List<Grade> grades;

    @BeforeEach
    void setUp() {
        courses = courseRepository.saveAll(List.of(
                new Course("CS101", "Intro to java"),
                new Course("CS103", "Databases")
        ));
/*

        sections = sectionRepository.saveAll(List.of(
                new Section("CS101-A", "CS101", (short) 1802, "Balderez"),
                new Section("CS101-B", "CS101", (short) 1650, "Su"),
                new Section("CS103-A", "CS103", (short) 1200, "Rojas"),
                new Section("CS103-B", "CS103", (short) 1208, "Tonno")
        ));
 */



        grades = gradeRepository.saveAll(List.of(
                new Grade("Maya Charlotte", "CS101-A", 98),
                new Grade("James Fields", "CS101-A", 82),
                new Grade("Michael Alcocer", "CS101-B", 65),
                new Grade("Maya Charlotte", "CS103-A", 89),
                new Grade("Tomas Lacroix", "CS101-A", 99),
                new Grade("Sara Bisat", "CS101-A", 87),
                new Grade("James Fields", "CS101-B", 46),
                new Grade("Helena Sepulvida", "CS103-A", 72)
        ));

    }



/*
    @AfterEach
    void tearDown() {
        courseRepository.deleteAll();
        sectionRepository.deleteAll();
        gradeRepository.deleteAll();
    }


 */


    @Test
    void findAverageScoreBySection_ValidData_SectionAndAVG() {

        List<Object[]> result = gradeRepository.findAverageScoreBySection();

        assertEquals(3, result.size());
        assertEquals(55.5, result.get(0)[1]);
        assertEquals("CS101-B", result.get(0)[0]);


    }

    @Test
    void findAverageScoreBySectionCount_ValidData_SectionAndAVG() {
        List<Object[]> result = gradeRepository.findAverageScoreBySectionMin(2);

        assertEquals(1, result.size());
        assertEquals("CS101-A", result.get(0)[0]);
        assertEquals(91.5, result.get(0)[1]);

        result = gradeRepository.findAverageScoreBySectionMin(4);
        assertEquals(0, result.size());




    }



}
