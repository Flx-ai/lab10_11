package ru.vsu.cs.kulinchenko.tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.kulinchenko.models.Faculty;
import ru.vsu.cs.kulinchenko.models.Institute;

import java.util.List;

public class FacultyTest {
    private static Faculty faculty = new Faculty("ФизФак");

    @BeforeClass
    public static void initialisation() {
        Institute IS = new Institute("ИС", "г. Воронеж, Университетская площадь, к.1А");
        faculty.addInstitute(IS);
    }

    @Test
    public void addInstitute() {
        Institute PIIT = new Institute("ПиИТ", "г. Воронеж, Университетская площадь, к.1А");
        faculty.addInstitute(PIIT);
        List<Institute> institutes = faculty.getInstitutes();

        Institute expectedInstitute = new Institute("ПиИТ", "г. Воронеж, Университетская площадь, к.1А");

        boolean expected = institutes.contains(expectedInstitute);
        Assert.assertTrue(expected);
    }
}