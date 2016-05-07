package com.amazon.exercise.athlete.mxu;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Martin on 5/6/2016.
 */
public class ManTowerAssember implements Comparator<Athlete>{

    public int getManTowerLevels (List<Athlete> athletes) {
        athletes.sort(this);

        int totalMass = 0;
        for (int i=0; i<athletes.size(); i++) {
            if (totalMass > athletes.get(i).getStrength()) {
                athletes.remove(i);
                i--;
                continue;
            }

            totalMass += athletes.get(i).getMass();
        }

        return athletes.size();

    }

    public int compare(Athlete a1, Athlete a2) {
        if (a1.getStrength() > a2.getStrength()) {
            return 1;
        }

        if (a1.getStrength() < a2.getStrength()) {
            return -1;
        }

        return 0;
    }
}


