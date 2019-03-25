package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        ArrayList<String> result = new ArrayList<>(collection1);
        Collection<List<String>> valuesOfCollection2 = collection2.values();
        ArrayList<String> newCollection2 = new ArrayList<>();
        for (List<String> cl2 : valuesOfCollection2)
            newCollection2.addAll(cl2);
        result.retainAll(newCollection2);
        return result;
    }
}
