class Solution {
    public int minimumDifference(int[] nums) {
        int n = nums.length / 2;

        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            left[i] = nums[i];
            right[i] = nums[i + n];
        }

        // leftSums[k] = all subset sums picking k elements from left
        // rightSums[k] = all subset sums picking k elements from right
        List<List<Integer>> leftSums = new ArrayList<>();
        List<List<Integer>> rightSums = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            leftSums.add(new ArrayList<>());
            rightSums.add(new ArrayList<>());
        }

        // Generate subsets for left half
        for (int mask = 0; mask < (1 << n); mask++) {
            int sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += left[i];
                    count++;
                }
            }
            leftSums.get(count).add(sum);
        }

        // Generate subsets for right half
        for (int mask = 0; mask < (1 << n); mask++) {
            int sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += right[i];
                    count++;
                }
            }
            rightSums.get(count).add(sum);
        }

        // Sort right sums for binary search
        for (int i = 0; i <= n; i++) {
            Collections.sort(rightSums.get(i));
        }

        int totalSum = 0;
        for (int num : nums) totalSum += num;

        int ans = Integer.MAX_VALUE;

        // Try all valid (k, n-k) splits
        for (int k = 0; k <= n; k++) {
            List<Integer> leftList = leftSums.get(k);
            List<Integer> rightList = rightSums.get(n - k);

            for (int leftSum : leftList) {
                int target = totalSum / 2 - leftSum;

                int idx = Collections.binarySearch(rightList, target);

                if (idx >= 0) {
                    int total = leftSum + rightList.get(idx);
                    ans = Math.min(ans, Math.abs(2 * total - totalSum));
                } else {
                    idx = -idx - 1;

                    if (idx < rightList.size()) {
                        int total = leftSum + rightList.get(idx);
                        ans = Math.min(ans, Math.abs(2 * total - totalSum));
                    }

                    if (idx > 0) {
                        int total = leftSum + rightList.get(idx - 1);
                        ans = Math.min(ans, Math.abs(2 * total - totalSum));
                    }
                }
            }
        }

        return ans;
    }
}
