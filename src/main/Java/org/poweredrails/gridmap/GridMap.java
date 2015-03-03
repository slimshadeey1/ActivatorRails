package org.poweredrails.gridmap;

import java.util.Collection;

public interface GridMap {
	
	void createLayer(final int l);
	
	void createGrid(final int l, final Object a, final Object b, final Object object);
	
	Object getGridObject(final int l, final Object a, final Object b);
	
	String gridToString(final int l, final Object a, final Object b);
	
	<X> GridMap fromArray(final X[] array);
	
	<X> GridMap fromCollection(final Collection<X> collection);

}
