package com.DS.assignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DijkstraAlgoTask {
	
	private int vertices;
	private LinkedList<Node>[] adjList;
	class Node {
		int dest;
		int weight;
		
		Node(int d, int w){
			dest = d;
			weight = w;
		}
	}
	
	DijkstraAlgoTask(int v){
		vertices = v;
		adjList = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	void dijkstra(int src) {
		int[] dist = new int[vertices];
		boolean[] visited = new boolean[vertices];
		
		PriorityQueue<Node> pq = new PriorityQueue<>(vertices,
				Comparator.comparing(node -> node.weight));
		
		Arrays.fill(dist,  Integer.MAX_VALUE);
		dist[src] = 0;
		pq.add(new Node(src,0));
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int u = node.dest;
			if(!visited[u]) {
				visited[u] = true;
				for(Node neighbour: adjList[u]) {
					int v = neighbour.dest;
					int weight = neighbour.weight;
					
					if(!visited[v] && 
							dist[u] != Integer.MAX_VALUE && 
							weight < dist[v]) {
						dist[v] = dist[u] + weight;
						pq.add(new Node(v,dist[v]));
					}
				}
			}
		}
		printSolution(dist);
	}
	
	private void printSolution(int[] dist) {
		System.out.println("Vertex \t Distance from source");
		for(int i=0;i<vertices;i++) {
			System.out.println(i+ " \t\t " + dist[i]);
		}
	}
	
	void addEdge(int src, int dest, int weight) {
		adjList[src].add(new Node(dest,weight));
		adjList[dest].add(new Node(src,weight));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 5;
		DijkstraAlgoTask g = new DijkstraAlgoTask(v);
		g.addEdge(0, 1, 10);
		g.addEdge(0, 2, 1);
		g.addEdge(0, 3, 4);
		g.addEdge(1, 2, 2);
		g.addEdge(1, 3, 5);
		g.addEdge(1, 4, 1);
		g.addEdge(2, 3, 2);
		g.addEdge(3, 4, 3);
		
		g.dijkstra(0);

	}

}
