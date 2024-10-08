package nivel01.ejercicio02.main.java.com.modules;

import java.util.ArrayList;
import java.util.List;

public class FirstList {

    private List<Integer> listFirstList;

    public FirstList() {
        this.listFirstList = new ArrayList<>();
    }

    public void add(Integer i) {
        this.listFirstList.add(i);
    }

    public List<Integer> getFirstList() {
        return listFirstList;
    }
}
