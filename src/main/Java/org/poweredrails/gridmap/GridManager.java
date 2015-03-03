package org.poweredrails.gridmap;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.poweredrails.gridmap.util.ElementExistsException;
import org.poweredrails.gridmap.util.GridKey;

public class GridManager implements Iterable<Object>, Serializable, Comparable<GridManager>, GridMap {

	private static final long serialVersionUID = -5332181700259202717L;
	
	private static Map<Integer, Object> layer = new HashMap<Integer, Object>();
	
	private static Map<Object, Object> grid = new HashMap<Object, Object>();
	
	protected GridManager() {
		
	}
	
	@Override
	public void createLayer(int l) {
		if(l != 0) {
			if(!GridManager.layer.containsKey(l)) {
				GridManager.layer.put(l, null);
				return;
			} else {
				new ElementExistsException("Layer ID already exists.");
			}
		} else {
			new NullPointerException("Layer ID cannot equal 0.");
		}
	}

	@Override
	public void createGrid(int l, Object a, Object b, Object object) {
		if(!new GridKey(a, b).equals(null)) {
			if(!GridManager.grid.containsKey(new GridKey(a, b))) {
				GridManager.layer.put(l, GridManager.grid.put(new GridKey(a, b), object));
				return;
			} else {
				new ElementExistsException("Grid ID already exists.");
			}
		} else {
			new NullPointerException("Grid ID cannot equal null.");
		}
	}
	
	@Override
	public Object getGridObject(int l, Object a, Object b) {
		if(!new GridKey(a, b).equals(null) || l != 0) {
			if(GridManager.layer.containsKey(l) && GridManager.grid.containsKey(new GridKey(a, b))) {
				return GridManager.grid.get(new GridKey(a, b));
			} else {
				return "Object doesn't exist.";
			}
		} else {
			new NullPointerException("Grid ID or Layer ID cannot equal null or 0.");
			return null;
		}
	}
	
	@SuppressWarnings("static-access")
	@Override
	public String gridToString(int l, Object a, Object b) {
		GridKey rawGrid = new GridKey(a, b);
		if(!rawGrid.equals(null) || l != 0) {
			return "[(" + rawGrid.getGridA() + ")(" + rawGrid.getGridB() + ")]";
		} else {
			new NullPointerException("Grid ID or Layer ID cannot equal null or 0.");
			return null;
		}
		
	}

	@Override
	public int compareTo(GridManager arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <X> GridMap fromArray(X[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <X> GridMap fromCollection(Collection<X> collection) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
