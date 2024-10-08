package nivel01.ejercicio02.main.java.com.modules;

import java.util.ArrayList;
import java.util.List;

public class SecondList {

    private List<Integer> listSecondList;

    public SecondList() {
        this.listSecondList = new ArrayList<>();
    }

    public void add(Integer i) {
        this.listSecondList.add(i);
    }

    public List<Integer> getListSecondList() {
        return listSecondList;
    }

}