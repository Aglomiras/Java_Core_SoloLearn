package org.mpei.WorkSololearn_9.Practic_1;

public class Player {
    Player(Difficulty diff) {
        //введите код сюда
        switch (diff) {
            case EASY -> System.out.println("You have 3000 bullets");
            case MEDIUM -> System.out.println("You have 2000 bullets");
            case HARD -> System.out.println("You have 1000 bullets");
        }
    }
}
