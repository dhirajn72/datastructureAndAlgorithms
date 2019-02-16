package interview;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 08/02/19
 */
public class RetainAll {
    public static void main(String[] args) {
        ArrayList<String> bags = new ArrayList<String>();

        // Add values in the bags list.
        bags.add("pen");
        bags.add("pencil");
        bags.add("paper");

        // Creating another array list
        ArrayList<String> boxes = new ArrayList<String>();

        // Add values in the boxes list.
        boxes.add("pen");
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");

        // Before Applying method print both lists
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);
        List<String> notMatched=new ArrayList<>();

        /*bags.stream()
                .forEach(bag->{
                    boxes.stream()
                            .filter(box->  bag.equals(box))
                            .forEach(x->notMatched.add(x));
                });*/



        for (String original : boxes) {
            if (!bags.contains(original)) {
                notMatched.add(original);
            }
        }


        System.out.println(notMatched);

    }
}
