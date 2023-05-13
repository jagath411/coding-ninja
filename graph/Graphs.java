package graph;
import java.util.*;
public class Graphs {
	public static void dftraversal(int adjMatrix[][],int currentVertex,boolean visited[]) {
		System.out.println(currentVertex+" ");
		for(int i=0;i<adjMatrix.length;i++)
		{
			if(adjMatrix[currentVertex][i]==1 && visited[i]==false) {
				dftraversal(adjMatrix,i,visited);
			}
		}
	}
	public static void dftraversal(int adjMatrix[][]) {
		boolean visited[]=new boolean[adjMatrix.length];
		dftraversal(adjMatrix,0,visited);
	}
	public static void bftraversal(int adjMatrix[][]) {
		Queue<Integer> pendingVertices = new LinkedList<>();
		boolean visited[]=new boolean[adjMatrix.length];
		visited[0]=true;
		pendingVertices.add(0);
		while(!pendingVertices.isEmpty()) {
			int currentVertex =pendingVertices.poll();
			System.out.println(currentVertex+" ");
			for(int i=0;i<adjMatrix.length;i++) {
				pendingVertices.add(i);
				visited[i]=true;
			}
		}
	}
   public static void main(String[] arge){
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int e=s.nextInt();
	   int adjMatrix[][]=new int[n][n];
	   for(int i=0;i<e;i++) {
		   int v1=s.nextInt();
		   int v2=s.nextInt();
		   adjMatrix[v1][v2]=1;
		   adjMatrix[v2][v1]=1;
		  }
       for(int i=0;i<n;i++) {
    	   for(int j=0;j<n;j++) {
    		  System.out.println(adjMatrix[i][j]+" ");
    	   }
          System.out.println();
       }
   }
}
