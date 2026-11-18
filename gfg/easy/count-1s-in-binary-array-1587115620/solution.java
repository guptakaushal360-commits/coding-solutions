class Solution {
 	public int countOnes(int[] arr) {
 	    int n = arr.length;
 	    
 	    int ans = 0;
 	     for( int x:arr){
 	         if(x==1){
 	             ans++;
 	         }
 	     }
 	     return ans;
 	     
 	    
 	    
 	    
 	    
 	    
 	    
 	}
} 	
// 		// code here
// 		int l = 0;
// 		int r = arr.length-1;
		
// 		int ans = arr.length;
// 		while (l <= r) {
// 			int mid = l + (r - l)/2;
			
// 			if (arr[mid] == 1) {
// 				l = mid + 1;
// 			} else {
// 				ans = mid;
// 				r = mid - 1;
// 			}
// 		}
// 		return ans;
//	}
//}
