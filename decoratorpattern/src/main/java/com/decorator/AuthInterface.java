package com.decorator;

import java.io.IOException;

public interface AuthInterface {
    void auth(String username, String password) throws AuthException, IOException;
}
