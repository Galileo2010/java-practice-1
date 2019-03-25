package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<String>(collection1);
        List<String> newCollection2 = new ArrayList<String>();
        for (List<String> cl2 : collection2)
            newCollection2.addAll(cl2);
        result.retainAll(newCollection2);
        return result;
    }
}
