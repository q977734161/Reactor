/**
 * sharemer.com Inc.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package com.lxb.reactor;

import java.io.IOException;

public class ServerMain {

    public static void main(String[] args) throws IOException {
        new Thread(new Channel(2333)).start();
    }

}
