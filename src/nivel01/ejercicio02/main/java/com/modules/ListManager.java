package nivel01.ejercicio02.main.java.com.modules;

import java.util.ListIterator;

public class ListManager {

    FirstList firstList;
    SecondList secondList;

    public ListManager() {
        firstList = new FirstList();
        secondList = new SecondList();
    }

    public void fillFirstList() {
        this.firstList.add(0);
        this.firstList.add(1);
        this.firstList.add(2);
        this.firstList.add(3);
        this.firstList.add(4);
        this.firstList.add(5);
    }

    public void copyToSecondListInReverseOrder() {
        ListIterator<Integer> iterator = firstList.getFirstList().listIterator(firstList.getFirstList().size());
        while (iterator.hasPrevious()) {
            secondList.add(iterator.previous());
        }
    }

    public FirstList getFirstList() {
        return firstList;
    }

    public SecondList getSecondList() {
        return secondList;
    }



}
