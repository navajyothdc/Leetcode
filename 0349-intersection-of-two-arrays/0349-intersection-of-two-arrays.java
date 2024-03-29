class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        int j=0;
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                nums1[j] = nums2[i];
                j++;
                set.remove(nums2[i]);
            }
        }
        int[] result = new int[j];
        for(int i=0; i<j; i++){
            result[i] = nums1[i];
        }
        return result;
    }
}