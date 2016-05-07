package com.amazon.exercise.athlete.mxu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * <b>Coding exercise:</b>
 * Every athlete is characterized by his mass 'm' (in kg) and strength 's' (in kg). You are to find the maximum number
 * of athletes that can form a tower standing one upon another. An athlete can hold a tower of athletes with total mass
 * equal to his strength or less than his strength. Input contains the number of athletes n and their parameters. These
 * inputs can be assumed to be passed as arguments (Integer n and List<Pair<Integer, Integer>> parameterList) appropriate
 * for your language of choice.
 */
public class ManTowerTest {
    private ManTowerAssember athleteTower;

    @Test
    public void inTheOriginalExampleMaxNumberIs2(){
        List<Athlete> athletes = new ArrayList<Athlete>(){{
            add(new Athlete(3, 4));
            add(new Athlete(2, 2));
            add(new Athlete(7, 6));
            add(new Athlete(4, 5));
        }};
        athleteTower = new ManTowerAssember();

        int max = athleteTower.getManTowerLevels(athletes);

        assertEquals(2, max);
    }

    @Test
    public void whenFirstGuyIsStr9AndSecondGuyIsStr7MaxTowerIs3(){
        List<Athlete> athletes = new ArrayList<Athlete>(){{
            add(new Athlete(3, 9));
            add(new Athlete(2, 7));
            add(new Athlete(7, 6));
            add(new Athlete(4, 5));
        }};
        athleteTower = new ManTowerAssember();

        int max = athleteTower.getManTowerLevels(athletes);

        assertEquals(3, max);
    }
}
