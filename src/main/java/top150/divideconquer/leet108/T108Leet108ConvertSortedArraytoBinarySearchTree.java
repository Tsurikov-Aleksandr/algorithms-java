package top150.divideconquer.leet108;

public class T108Leet108ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBTS(nums, 0, nums.length - 1);
    }

    private TreeNode createBTS(int[] nums, int left, int rigth) {
        if (left > rigth) {
            return null;
        }
        int mid = left + (rigth - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBTS(nums, left, mid - 1);
        root.right = createBTS(nums, mid + 1, rigth);
        return root;
    }

}
