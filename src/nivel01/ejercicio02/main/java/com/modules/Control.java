package nivel01.ejercicio02.main.java.com.modules;

import static java.lang.System.out;

public class Control {

    public void start(){
        ListManager listManager = new ListManager();

        listManager.fillFirstList();

        listManager.copyToSecondListInReverseOrder();

        out.println("First List: " + listManager.getFirstList().getFirstList());
        out.println("Reverse order of segund list: " + listManager.getSecondList().getListSecondList());
    }

}
