package secao17.set.exercicio.proposto.entities;

import java.util.Objects;

public class Student {
    private Integer userCode;

    public Student(Integer userCode) {
        this.userCode = userCode;
    }

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer userCode) {
        this.userCode = userCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(userCode, student.userCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userCode);
    }
}