package org.mpei.WorkSololearn_8.Starter_2;

class Robot {
    int id;

    Robot (int i) {
        id = i;
        Brain b = new Brain();
        b.think();
    }

    private class Brain {
        public void think() {
            System.out.println(id + " is thinking");
        }
    }
    /**
     * Класс Robot имеет внутренний класс Brain. Внутренний класс может получить доступ ко всем переменным
     * и методам его внешнего класса, но к этому классу не может быть получен доступ извне класса.
     * */
}
