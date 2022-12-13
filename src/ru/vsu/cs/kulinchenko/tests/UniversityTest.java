package ru.vsu.cs.kulinchenko.tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.vsu.cs.kulinchenko.models.*;

import java.util.List;


public class UniversityTest {
    private static final University university = new University("ВГУ");

    @BeforeClass
    public static void initialisation(){
        university.addFaculty(new Faculty("ФКН"));
        university.addFaculty(new Faculty("ПММ"));
        university.addFaculty(new Faculty("МатФак"));

        Employee dean = new Dean(1, "Крыловецкий Александр Абрамович", "aakryl@sc.vsu.ru");
        university.addEmployee(dean);
    }

    @Test
    public void addFaculty(){
        university.addFaculty(new Faculty("ФизФак"));
        List<Faculty> faculties = university.getFaculties();

        Faculty expectedFaculty = new Faculty("ФизФак");

        boolean expected = faculties.contains(expectedFaculty);
        Assertions.assertTrue(expected);
    }

    @Test
    public void addEmployee() {
        Institute IS = new Institute("ИС", "г. Воронеж, Университетская площадь, к.1А");

        university.addEmployee(new ResearchAssociate(2,
                "Власов Сергей Васильевич", "svv@cs.vsu.ru", IS));
        List<Employee> employees = university.getEmployees();

        Employee expectedStaff = new ResearchAssociate(2,
                "Власов Сергей Васильевич", "svv@cs.vsu.ru", IS);

        boolean expected = employees.contains(expectedStaff);
        Assert.assertTrue(expected);

    }

    @Test
    public void getNumberOfEmployees() {
        Assert.assertSame(university.getEmployees().size(), university.getNumberOfEmployees());
    }



}