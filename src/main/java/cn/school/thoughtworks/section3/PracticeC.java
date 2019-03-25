package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result = new HashMap<>();
        for (String s : collectionA)
            result.put(s, 1 + (result.containsKey(s) ? result.get(s) : 0));
        for (List<String> list : object.values()) {
            for (String s : list) {
                if (result.containsKey(s))
                    result.put(s, result.get(s) - Math.floorDiv(result.get(s),3));
            }
        }
        return result;
    }
}
