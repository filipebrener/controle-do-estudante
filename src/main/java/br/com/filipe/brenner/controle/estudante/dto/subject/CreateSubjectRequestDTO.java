package br.com.filipe.brenner.controle.estudante.dto.subject;


import br.com.filipe.brenner.controle.estudante.model.UserModel;

public class CreateSubjectRequestDTO {

    private String name;

    private String code;

    private UserModel teacher;

    private Float totalPoints;

    private Float minimumAverage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserModel getTeacher() {
        return teacher;
    }

    public void setTeacher(UserModel teacher) {
        this.teacher = teacher;
    }

    public Float getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Float totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Float getMinimumAverage() {
        return minimumAverage;
    }

    public void setMinimumAverage(Float minimumAverage) {
        this.minimumAverage = minimumAverage;
    }
}
