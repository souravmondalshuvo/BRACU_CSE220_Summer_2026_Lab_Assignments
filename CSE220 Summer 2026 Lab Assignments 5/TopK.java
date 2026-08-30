public class TopK {
    
    public static Integer[] topK(int[] nums, int k) {

        MaxHeap bojha = new MaxHeap(nums.length);

        for(int i = 0; i < nums.length; i++) {
            bojha.insert(nums[i]);
        }

        Integer[] folafol = new Integer[k];

        for(int t = 0; t < k; t++) {
            folafol[t] = bojha.extractMax();
        }

        return folafol;
    }
}
