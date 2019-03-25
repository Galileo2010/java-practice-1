package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        for (String s : collection1) {
            if (matchType1(s)){
                String[] part = s.split("-");
                insertToMap(part[0], parseInt(part[1]),result);
            }
            else
                insertToMap(s,1,result);
        }
        return result;
    }

    // 判断是否为d-5型数据
    boolean matchType1(String str)
    {
        String[] result = str.split("-");
        if (result.length != 2){
            return false;
        }
        else{
            for (int i= 0; i < result[1].length(); i++){
                if (!Character.isDigit(result[1].charAt(i)))
                    return false;
            }
            return true;
        }
    }
    // 向map中插入number个数的s
    void insertToMap(String s, int number, Map<String, Integer> result) {
        number += result.containsKey(s) ? result.get(s) : 0;
        result.put(s, number);
    }
}
