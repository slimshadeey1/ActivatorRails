package org.poweredredstone.commons.gridmap.util;

public class ElementExistsException extends Exception {

    private static final long serialVersionUID = -932183762985472639L;

    public ElementExistsException() {
    }

    public ElementExistsException(String message) {
        super(message);
    }

    public ElementExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementExistsException(Throwable cause) {
        super(cause);
    }

}
