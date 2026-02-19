class Solution {
    int majorityElement(int arr[]) {
        
        // int n = arr.length;
        
        // if(n == 1) return arr[0];
        
        // int el = -1;
        
        // int cnt = 0;
        
        // int candidate = -1;
        
        // int maxCnt = 0;
        
        // for(int i = 0; i < n; i++){
            
        //     if(el == -1 && cnt == 0){
        //         el = arr[i];
        //         cnt = 1;
        //     }
            
        //     else if(arr[i] == el){
        //         cnt++;
        //     }
            
        //     else if(arr[i] != el){
        //         if(cnt > maxCnt){
        //             candidate = el;
        //             maxCnt = cnt;
        //         }
        //         cnt = 1;
        //         el = arr[i];
        //     }
        // }
        
        // int cnt2 = 0;
        
        // for(int i = 0; i < n; i++){
        //     if(arr[i] == candidate){
        //         cnt2++;
        //     }
        // }
        
        // if(cnt2 > n / 2) return candidate;
        
        // return -1;
        
        int n = arr.length;
        
        int cnt = 0;
        
        int el = -1;
        
        for(int i = 0; i < n; i++){
        
            
            if(cnt == 0){
                 el = arr[i];
                cnt++;
            }
            else if(arr[i] == el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        
        int freq = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == el){
                freq++;
            }
        }
        
        return (freq > n / 2) ? el:-1;
        
    }
}