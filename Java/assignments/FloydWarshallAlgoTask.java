package com.DS.assignments;

public class FloydWarshallAlgoTask {
	final static int INF =99999;
	
	void floydWarshall(int graph[][] ) {
		final int V = graph.length;
		int dist[][] = new int[V][V];
		int i,j,k;
		for(i=0;i<V;i++) {
			for(j=0;j<V;j++) {
				dist[i][j] = graph[i][j];
			}
		}
		
		for(k=0;k<V;k++) {
			for(i=0;i<V;i++) {
				for(j=0;j<V;j++) {
					if(dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}
		
		printSolution(dist);
	}
	
	void printSolution(int dist[][]) {
		for(int i=0;i<dist.length;i++) {
			for(int j=0;j<dist[i].length;j++) {
				if(dist[i][j] == INF) {
					System.out.print("INF ");
				} else {
					System.out.print(dist[i][j] + " ");					
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int graph[][] = { { 0,10, 1,INF},
						  {10, 0,INF, 2},
						  { 1,INF, 0, 1},
						  {INF, 2, 1, 0} };
		
		FloydWarshallAlgoTask obj = new FloydWarshallAlgoTask();
		
		obj.floydWarshall(graph);

	}
}
