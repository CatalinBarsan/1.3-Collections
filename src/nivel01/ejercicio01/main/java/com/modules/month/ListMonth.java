package nivel01.ejercicio01.main.java.com.modules.month;
import java.util.ArrayList;
import java.util.List;

public class ListMonth {

    private ArrayList<Month> months;

    public ListMonth() {
        months = new ArrayList();
    }

    public void addMonthToList(int position, String month) {
        Month newMonth = new Month(month);
        months.add(position,newMonth);
    }

    public List<Month> getMonth() {
        return months;
    }

}
