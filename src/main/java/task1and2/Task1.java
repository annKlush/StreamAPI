package task1and2;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public void everyThirdElem(String[] nam) {
        List<String> res = new ArrayList<String>();
        res.add(1 + ". " + nam[0]);
        for (int i = 3; i < nam.length; i = i + 3) {
            res.add(i / 3 + 1 + ". " + nam[i]);
        }
        System.out.println(res);
    }
}
