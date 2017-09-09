package net.jacoblo.dataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import net.jacoblo.data.Edge.BasicEdge;
import net.jacoblo.data.Edge.Edgeable;
import net.jacoblo.data.Vertex.BasicVertex;
import net.jacoblo.data.Vertex.Vertexable;

public class Graph<V extends Vertexable, E extends Edgeable> implements Iterable<V>{
	private ArrayList<V> vertices;
	
	public Graph() {
	  vertices = new ArrayList<V>();
	}
	
	public ArrayList<V> getVertices() { return vertices; }
	
	public void addVertex(V v) {
	  vertices.add(v);
	}
	
	public static <V extends Vertexable, K extends Number> void addEdge(V from, V to, K edgeWeight){
		if (from == null || to == null || edgeWeight == null) return;
		if (!(from.getVertexType().equals(to.getVertexType()))) return;
		
		if (from.getVertexType().equals("BasicVertex")) {
			BasicEdge<K> edge = new BasicEdge<K>(from,to,edgeWeight);
			from.addEdge(edge);
		}
	}
	
	@Override
	public String toString() {
	  String result = "Graph : ";
	  for (V v : vertices) {
	    result += "V : " + v.toString() + " ";
	    for (Edgeable e : v.getEdges()) {
	    	result += "--" + e.toString() + "--" + e.getToVertex().toString() + " ";
	    }
	    result += "\n";
	  }
	  return result;
	}
	
//	public void resetVisit() {
//		if (vertices == null || vertices.size() <= 0) 	return;
//		for (V v : vertices) {
//			v.visited = false;
//			for (BasicEdge<BasicVertex<T,K>,K> e : v.getEdges()) {
//				e.visitedEdge = false;
//			}
//		}
//	}
	
	public V getRandomVertex() {
		if (vertices == null || vertices.size() <= 0) return null;
		return vertices.get((int)(Math.random() * vertices.size()));
	}
	
	public int size() {
		return ( vertices == null ? 0 : vertices.size());
	}

	@Override
	public Iterator<V> iterator() {
		return vertices.iterator();
	}
}
