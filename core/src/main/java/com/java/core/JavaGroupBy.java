package com.java.core;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 09/08/19
 */
public class JavaGroupBy {
    public static void main(String[] args) {

        List<String> listWithDuplicates = Arrays.asList("a", "bb", "c", "d", "bb");
        Map<String,Integer> map=listWithDuplicates.stream().collect(Collectors.toMap(x->x,y->y.length(),(p,q)->q,LinkedHashMap::new));
        System.out.println(listWithDuplicates);
        System.out.println(map);

    }
}
