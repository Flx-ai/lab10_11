package ru.vsu.cs.kulinchenko;

import ru.vsu.cs.kulinchenko.models.*;

public class Main {

    public static void main(String[] args) {
        University university = new University("VSU");
        Faculty faculty = new Faculty("Faculty of Computer Science");
        Institute institute = new Institute("Information systems and technologies", "University Square, 1");
        Employee dean = new Dean(1, "Krylovetsky A.A.", "aakryl@sc.vsu.ru");
        Employee researchAssociate = new ResearchAssociate(2, "Ivanov V.A.", "ivanov@mail.ru", institute);
        Employee personal = new AdministrativePersonal(3, "Kulinchenko D.I.", "dima.kul22@mail.ru");

        university.addFaculty(faculty);
        faculty.addInstitute(institute);
        university.addEmployee(dean);
        university.addEmployee(researchAssociate);
        university.addEmployee(personal);

        System.out.println(university);
        System.out.println(faculty);
        System.out.println(institute);
        System.out.println(dean);
        System.out.println(researchAssociate);
        System.out.println(personal);

        for (Employee employee: university.getEmployees()) {
            employee.work();
        }

    }
}
