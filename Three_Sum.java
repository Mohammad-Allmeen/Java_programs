import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>(); // Use a set to avoid duplicate triplets

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                       // triplet.sort(null); // Sort to ensure the triplet is in a canonical order
                        result.add(triplet); // Add to the set to avoid duplicates
                    }
                }
            }
        }

        return new ArrayList<>(result); // Convert the set to a list for the result
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 1, 1};
        int[] nums3 = {0, 0, 0};

        System.out.println("Result for nums1: " + threeSum(nums1));
        System.out.println("Result for nums2: " + threeSum(nums2));
        System.out.println("Result for nums3: " + threeSum(nums3));
    }
}
