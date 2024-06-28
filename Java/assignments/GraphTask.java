package com.DS.assignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Graph{
	private int vertices;
	private LinkedList<Integer> adjList[];
	
	Graph(int v) {
		vertices = v;
		adjList = new LinkedList[v];
		for(int i=0;i<v;++i) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	void addEdge(int v, int w) {
		adjList[v].add(w);
	}
	
	void printGraph() {
		for(int i=0;i<vertices;++i) {
			System.out.print("Vertex "+i+": ");
			for(Integer node: adjList[i]) {
				System.out.print(" "+node);
			}
			System.out.println();
		}
	}
	
	void bfs(int startNode) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[vertices];
		
		visited[startNode] = true;
		queue.add(startNode);
		while(!queue.isEmpty()) {
			int currentNode = queue.poll();
			System.out.println(currentNode + " ");
			for(int neighbour: adjList[currentNode]) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					queue.add(neighbour);
				}
			}
		}
	}
	
	void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.print(v + " ");
		
		Iterator<Integer> i = adjList[v].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				DFSUtil(n, visited);
			}
		}
	}
	
	void DFS(int v) {
		boolean visited[] = new boolean[vertices];
		DFSUtil(v, visited);
	}
}

public class GraphTask {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v=5;
		Graph g = new Graph(v);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 2);
		
		g.printGraph();
		
		g.bfs(2);
		g.DFS(3);
		
	}
	

}
