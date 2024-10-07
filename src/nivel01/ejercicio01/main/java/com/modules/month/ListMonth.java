package nivel01.ejercicio01.main.java.com.modules.month;
import java.util.ArrayList;

public class ListMonth {

    ArrayList<Month> months;

    public ListMonth() {
        months = new ArrayList();
    }

    public void addMonthToList(int position, String month) {
        Month newMonth = new Month(month);
        months.add(position,newMonth);
    }

    public ArrayList<Month> getMonth() {
        return months;
    }

}
