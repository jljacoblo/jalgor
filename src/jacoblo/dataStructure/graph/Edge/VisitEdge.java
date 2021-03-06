package jacoblo.dataStructure.graph.Edge;

import jacoblo.dataStructure.graph.Vertex.Vertexable;

public class VisitEdge<K extends Number> extends BasicEdge<K> {
	private final String EDGE_TYPE = "VisitEdge";
  public boolean visitedEdge;
  
	public VisitEdge(Vertexable f, Vertexable t, K w) {
		super(f, t, w);
		visitedEdge = false;
	}

	@Override
	public String getEdgeType() {
		return EDGE_TYPE;
	}

}
