package interview;

import com.java.utils.DataUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 29/03/19
 */
public class MapSortByValue {
    public static void main(String[] args) {
        Map<String,Integer> stringIntegerMap= DataUtils.getMapObject();
        System.out.println(stringIntegerMap);

        stringIntegerMap=stringIntegerMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(key1,key2)->key2, LinkedHashMap::new));
        System.out.println(stringIntegerMap);

    }
}
