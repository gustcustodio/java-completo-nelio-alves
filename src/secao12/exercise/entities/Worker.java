package secao12.exercise.entities;

import secao12.exercise.entities.enums.WorkerLevel;

import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;
    private List<HourContract> contracts;
}
