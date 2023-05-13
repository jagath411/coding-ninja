package aray;

public class equillibiriyam {


		  int ls=0;
	       int rs=0;

	        int i;
	        for(i=1;i<arr.length;i++){
	            rs+=arr[i];
	            
	        }
	        for(i=1;i<arr.length;i++)
	        {
	            ls+=arr[i-1];
	            rs-=arr[i];
	            if(ls==rs){
	                return i;
	                
	            }
	        }
	        return -1;
		}

	}

}
