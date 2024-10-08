package nivel01.ejercicio01.main.java.com.modules.month;

import java.util.HashSet;
import java.util.Iterator;
import static java.lang.System.*;

public class MonthManager {


    private ListMonth nextMonth = new ListMonth();

    public void Start10Months() {

        nextMonth.addMonthToList(0,"January");
        nextMonth.addMonthToList(1,"February");
        nextMonth.addMonthToList(2,"March");
        nextMonth.addMonthToList(3,"April");
        nextMonth.addMonthToList(4,"May");
        nextMonth.addMonthToList(5,"June");
        nextMonth.addMonthToList(6,"July");
        nextMonth.addMonthToList(7,"September");
        nextMonth.addMonthToList(8,"October");
        nextMonth.addMonthToList(9,"November");
        nextMonth.addMonthToList(10,"December");

        out.println("\n");
        for (Month month: nextMonth.getMonth() ){
            out.println(month.getMonthName());
        }

    }

    public void addAugust() {
        nextMonth.addMonthToList(7,"August");
        out.println("\nAdd August month to 7 position. \n");
        for (Month month: nextMonth.getMonth() ){
            out.println(month.getMonthName());
        }

    }

    public void toHashSet(){
        out.println("\nArrayList go to HashSet");

        HashSet<Month> monthHashSet = new HashSet<>(nextMonth.getMonth());

        out.println("\nShow list whitout duplicates");
        for (Month month: monthHashSet){
            out.println(month.getMonthName());
        }

        out.println("\nGoing through the list with an iterator:");

        Iterator<Month> monthIterator = nextMonth.getMonth().iterator();

        while (monthIterator.hasNext()) {
            Month currentMonth = monthIterator.next();
            out.println(currentMonth.getMonthName());
        }

    }



}
