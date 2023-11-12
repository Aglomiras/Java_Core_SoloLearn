package org.mpei.WorkSololearn_13.Practic_4;

import java.util.HashMap;
import java.util.Iterator;

public class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //введите код сюда
    public void getWinner() {
        Iterator<String> iterator = players.keySet().iterator();
        String name = "";
        int max = 0;
        while (iterator.hasNext()) {
            String val = iterator.next();
            if (max < players.get(val)) {
                max = players.get(val);
                name = val;
            }
        }
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Bowling{" +
                "players=" + players +
                '}';
    }
}
