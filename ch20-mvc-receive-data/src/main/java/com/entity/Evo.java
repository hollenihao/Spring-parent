package com.entity;

import java.util.List;

public class Evo {
    private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Evo{" +
                "emps=" + emps +
                '}';
    }
}
