package com.es2.objectpool;

import java.io.File;

public class End {

    public End() {
        File f = new File("runningTest.tmp");
        f.delete();
    }
}
