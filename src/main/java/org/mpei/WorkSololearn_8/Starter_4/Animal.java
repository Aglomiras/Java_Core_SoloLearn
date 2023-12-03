package org.mpei.WorkSololearn_8.Starter_4;

public class Animal {
    String name;

    Animal(String n) {
        name = n;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    /**
     * Автоматически сгенерированный метод hashCode() используется для определения, где внутренне хранить объект.
     * Всякий раз, когда вы реализуете equals, вы ДОЛЖНЫ также реализовывать hashCode.
     * */
}
