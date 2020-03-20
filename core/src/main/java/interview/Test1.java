package interview;

import com.java.utils.DataUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 28/03/19
 */
public class Test1 {
    public static void main(String[] args) {
     List<Person> people= DataUtils.getPersonList();
     //people.forEach(System.out::println);
     //people.stream().map(Person::getFname).collect(Collectors.toList()).forEach(System.out::println);

        Person p1=new Person();
        p1.setFname("dhiraj");

        Person p2=new Person();
        p2.setFname("dhiraj");

        people.set(48,p1);
        people.set(47,p2);

        //Map<String,Long> stringMap=people.stream().collect(Collectors.toMap(Person::getFname,Person::getPhone,(original,duplicate)->original,ConcurrentHashMap::new));
        //Map<String,Long> stringMap=people.stream().collect(Collectors.toConcurrentMap(Person::getFname,Person::getPhone,(original,duplicate)->original));
        Map<Integer,List<Person>> stringMap=people.stream().collect(Collectors.groupingBy(x->x.getFname().length(),Collectors.toList()));

        stringMap.forEach((name,phone)-> System.out.println(name+":"+phone));
        System.out.println(stringMap.getClass());


    }
}
