package org.poweredredstone.commons.gridmap.util;

public class GridKey {

    private static Object grida;

    private static Object gridb;

    public GridKey(Object a, Object b) {
        super();
        grida = a;
        gridb = b;
    }

    @SuppressWarnings("Inconvertible types") public static int getGridA() {
        return (Integer) grida;
    }

    @SuppressWarnings("Inconvertible types") public static int getGridB() {
        return (Integer) gridb;
    }

}
