package ru.vsu.cs.kulinchenko.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.kulinchenko.models.Institute;
import ru.vsu.cs.kulinchenko.models.Project;
import ru.vsu.cs.kulinchenko.models.ResearchAssociate;

import java.util.Date;

public class ProjectTest {

    @Test
    public void setHours() {
        Institute IS = new Institute("ИС", "г. Воронеж, Университетская площадь, к.1А");
        ResearchAssociate staff = new ResearchAssociate(2,
                "Власов Сергей Васильевич", "svv@cs.vsu.ru", IS);
        Project project = new Project("App", -13,
                new Date(2021 - 1900, 12, 12),
                new Date(2022 - 1900, 2, 13), staff);

        Assert.assertNotEquals(-13, project.getHours());
    }
}