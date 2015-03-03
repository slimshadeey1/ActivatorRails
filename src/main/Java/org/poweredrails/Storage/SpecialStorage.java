package org.poweredrails.Storage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by benbyers on 3/2/15.
 */
public class SpecialStorage {

    public void writeData(Object a) throws IOException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        ObjectOutputStream obj = new ObjectOutputStream(bytes);
        obj.writeObject(a);

    }

}
