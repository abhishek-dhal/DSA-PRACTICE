class Twitter {

    //-------------------------------------//
      //basically 2 hashmap
      //one is follower -----> {set of followees}
      //second is userTweet map where user -----> tweet head
    //------------------------------------//


    //global clock
    private static int timeStamp = 0;
    
    // user-----> set of followees
    private Map<Integer,Set<Integer>> follows;
    
    // user ---> head of tweet link list
    private Map<Integer,Tweet> userTweets;

    private static class Tweet{
        int id;
        int time;
        Tweet next;

        Tweet(int id,int time,Tweet next){
            this.id = id;
            this.time = time;
            this.next = next;
        }
    }





    public Twitter() {
        follows = new HashMap<>();
        userTweets = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        //getting linked list head from userTweets map
        Tweet head = userTweets.get(userId);
        //create a new node of tweet
        Tweet newTweet = new Tweet(tweetId,timeStamp++,head);
        //put back
        userTweets.put(userId,newTweet);


        
    }
    
    public List<Integer> getNewsFeed(int userId) {
        //create output list
        List<Integer> res = new ArrayList<>();
        
        //creation of maxheap to get more recent tweet
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a,b)->b.time-a.time);
        
        //if given user tweet then add his tweet to pq
        if(userTweets.containsKey(userId)){
            pq.offer(userTweets.get(userId));      
       }

       //add followees tweet
       if(follows.containsKey(userId)){
        for(int followee : follows.get(userId)){
            //if followee have done any tweet
            if(userTweets.containsKey(followee)){
                pq.offer(userTweets.get(followee));
            }
        }
       }

       //get top ten recent tweets

       while(!pq.isEmpty() && res.size() < 10){
        Tweet t = pq.poll();
        res.add(t.id);

        if(t.next != null){
            pq.offer(t.next);
        }
       }
       return res;


        
    }
    
    public void follow(int followerId, int followeeId) {
        //cant follow itself

        if(followerId == followeeId) return;
        //create a key followerId ---> {} if absent
        follows.putIfAbsent(followerId,new HashSet<>());
        //then add followeeId to that {} associated with followerId
        follows.get(followerId).add(followeeId);
        
    }
    
    public void unfollow(int followerId, int followeeId) {
        //if not exist 
        if(!follows.containsKey(followerId)) return;

        follows.get(followerId).remove(followeeId);
        
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */