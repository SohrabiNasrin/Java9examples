package com.modiranedaneshmehvar.java9examples;

import java.util.Set;

/**
 * Created by Nasrin on 21/10/2017.
 */
public class StreamDistictionChallenge {

    public static void main(String[] args) {
        Set<Names>  names = Set.of(new Names("Nasrin"), new Names("Nasrin"),
                new Names("Yuka"), new Names("Nicolas"));

        names.stream()
             .distinct()
             .forEach( name -> System.out.println(name.name));
    }

    static class Names{
        private String name;
        Names(String name){
            this.name = name;
        }
    }
}
