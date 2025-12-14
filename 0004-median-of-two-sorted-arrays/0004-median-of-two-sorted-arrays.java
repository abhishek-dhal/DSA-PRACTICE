class Solution {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public void addNumbers(int number){
        //first add to left first
        left.offer(number);

        //then push max of left to right
        right.offer(left.poll());

        //if at any moment right size becomes greater than left pop from right and push min to left
        if(right.size() > left.size()){
            left.offer(right.poll());
        }


    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //left ----> max heap
        left = new PriorityQueue<>((a,b)->b-a);

        //right ----> min heap
        right = new PriorityQueue<>();

        for(int num:nums1){
            addNumbers(num);
        }
        for(int num: nums2){
            addNumbers(num);
        }
        //if left + right element numbers odd it contains median
        if((left.size() + right.size() ) % 2 != 0){
            return left.peek();
        }
        //otherwise left + right/2.0
        return (left.peek() + right.peek()) /2.0;
    }
}