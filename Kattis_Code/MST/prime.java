// A Java program for Prim's Minimum spanning tree

import java.util.*;
import java.lang.*;
import java.io.*;

class MST
{
	//Number of vertices in the graph
	private static final int V = 5;

	//A utility function to find the vertex with minimum key
	//value, from the set of vertices not yet included in MST
	int minKey(int key[], Boolean mstSet[])
	{
		// Initialize min value 
		int min = Integer.MAX_VALUE, min_index = -1;

		for(int v = 0; v < V; v++)
		{
			if(mstSet[v] == false && key[v] < min)
			{
				min = key[v];
				min_index = v;
			}
		}
		return min_index;
	}
	// Function to construct and print MST for a graph represented
	// using adjacency matrix representation
	void primMST(int graph[][])
	{
		//🌲store contruct MST
		int parent[] = new int[V];

		//Pick minimum weight edge in cut 
		int key[] = new int[V];

		//To represent set of vertices not yet incuded in MST
		Boolean mstSet[] = new Boolean[V];

		//initialize all keys as INFINITE 
		for(int i = 0; i < V; i++)
		{
			key[i] = Integer.MAX_VALUE;

			mstSet[i] = false;
		}

		//inlcude first 1st vertex in MST 
		key[0] = 0;

		//first node is always root of MST
		parent[0] = -1;

		// The MST will have V vertices 

		for(int count = 0; count < V - 1; count++)
		{
			int u = minkey(key, mstSet);

			// Add the picked vertex to the MST set 
			matSet[u] = true;

			// Update key value and parent index of the adjacent
            // vertices of the picked vertex. Consider only those
            // vertices which are not yet included in MST
			for(int v = 0; v < V; V++)
			{
				if (graph[u][v] != 0 && mstSet[v] == false &&
					graph[u][v] < key[v])
				{
					parent[v] = u;
					key[v] = graph[u][v];
				}
			}

			//print the constucted MST 
			printMST(parent, V, graph);
		}
	}


}