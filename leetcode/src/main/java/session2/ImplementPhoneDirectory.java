package session2;

import java.util.*;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class ImplementPhoneDirectory {
    public static void main(String[] args) {
        long l = 974385449989l;
        PhoneDirectory phone = new PhoneDirectory();
        phone.addNumber("dhiraj", 9987654);
        phone.addNumber("dhiraj", 34567);
        phone.addNumber("deep", 34567);
        phone.addNumber("aman", 34567);
        phone.addNumber("gowda", 34567);
        phone.addNumber("shoib", 34567);
        phone.addNumber("sameer", 34567);
        System.out.println(phone);
        System.out.println(phone.search("s"));
    }


    static class PhoneDirectory {
        Map<String, List<Long>> phoneMap = new HashMap<>();
        public void addNumber(String name, long number) {
            if (phoneMap.containsKey(name)) {
                phoneMap.get(name).add(number);
            } else {
                List<Long> nums = new ArrayList<>();
                nums.add(number);
                phoneMap.put(name, nums);
            }
        }

        public List<Map<String,List<Long>>> search(String name){
            List<Map<String,List<Long>>> result=new ArrayList<>();
            Map<String,List<Long>> map=new HashMap<>();
            Set<Map.Entry<String, List<Long>>> keys=phoneMap.entrySet();
            for (Map.Entry<String, List<Long>> s:keys){
                if (s.getKey().startsWith(name)){
                    map.put(s.getKey(),s.getValue());
                }
            }
            result.add(map);
            return result;
        }
        @Override
        public String toString() {
            return "PhoneDirectory{" +
                    "phoneMap=" + phoneMap +
                    '}';
        }
    }

}
