package Assignments.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_Items_Matching_a_Rule_1773 {
    /*
    Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
    Output: 1
    Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
    */

    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        int result = countMatches(items, ruleKey, ruleValue);

        System.out.println("Number of items matching the rule: " + result);
    }
        static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int count = 0;
            int index = 0;

            if(ruleKey.equals("type")) {
                index = 0;
            } else if(ruleKey.equals("color")) {
                index = 1;
            } else if(ruleKey.equals("name")) {
                index = 2;
            }
            for(int i = 0; i < items.size(); i++) {
                if(items.get(i).get(index).equals(ruleValue)) {
                    count++;
                }
            }

            return count;
    }
}
