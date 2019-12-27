package jooq;

import org.jooq.Field;
import org.jooq.impl.DSL;

/**
 * @author Dhiraj
 * @date 23/12/19
 */
public class QueryGenerator {
    public static void main(String[] args) {
        Field<String> q1= DSL.concat("col1","col2");
        System.out.println(q1);
        q1.add(99);
        System.out.println(q1);
        System.out.println(q1);


    }
}
