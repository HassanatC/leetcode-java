import java.util.HashSet;
class Solution {
    HashSet<Integer> hSet = new HashSet<>();

    for (int number : nums) {
        if (hSet.contains(number)) {
            return true;
        }

        hSet.add(number);
    }

    return false;

}
