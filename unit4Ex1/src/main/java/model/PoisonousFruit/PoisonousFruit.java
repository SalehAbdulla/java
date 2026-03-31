package model.PoisonousFruit;

import model.base.Fruit;

public class PoisonousFruit extends Fruit {
    private String symptom;

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
}
