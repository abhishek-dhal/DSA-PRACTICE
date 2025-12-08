class MedianFinder {
    //we need two heaps
    //left ---> max heap
    //right ----> min heap
    //as we care about middle for median
    //as we divide two halves left <= right
    //either size(left ) == size(right) or  size(left ) == size(right) + 1;
    // as left side elemens <= rigt half elements

    private PriorityQueue<Integer> left;
    private PriorityQueue<Integer> right;

    public MedianFinder() {
        left = new PriorityQueue<>((a,b)->b-a);
        right = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {

        //add first to left as every element start as small
        left.offer(num);
        //then add that left to right as left.peek() as it is the max
        right.offer(left.poll());
        
        //size(right) == size(left)
        //or size(left) == size(right+1)

        //size(right) > size(left) ---> right contain extra so pop small from right and add to left
        if(right.size() > left.size()){
            left.offer(right.poll());
        }




        
    }
    
    public double findMedian() {
        //odd case
        if(left.size() > right.size()){
            return left.peek();
        }

        //even case
        return (left.peek() + right.peek()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */