package com.cetin.generic;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMontains {
    LinkedList<Mountain> mtn = new LinkedList<>();

    LinkedList<ComparableMountain> cmtn = new LinkedList<>();

    class HeightCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain one, Mountain two) {
            return two.getAltitude().compareTo(one.getAltitude());
        }
    }

    class NameCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());
        }
    }

    public static void main(String[] args) {
        final SortMontains sm = new SortMontains();
        sm.go();
        sm.cgo();
    }

    private void go() {
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Marron", 14156));
        mtn.add(new Mountain("Castle", 14265));

        System.out.println("As entered:\n" + mtn);

        NameCompare nameCompare = new NameCompare();
        mtn.sort(nameCompare);
        System.out.println("by name:\n" + mtn);

        HeightCompare heightCompare = new HeightCompare();
        mtn.sort(heightCompare);
        System.out.println("by height:\n" + mtn);

    }

    private void cgo() {
        cmtn.add(new ComparableMountain("Longs", 14255));
        cmtn.add(new ComparableMountain("Elbert", 14433));
        cmtn.add(new ComparableMountain("Marron", 14156));
        cmtn.add(new ComparableMountain("Castle", 14265));

        System.out.println("As entered:\n" + cmtn);
        cmtn.sort(ComparableMountain::compareTo);
        System.out.println("by name:\n" + cmtn);

        Collections.sort(cmtn);

    }

}


