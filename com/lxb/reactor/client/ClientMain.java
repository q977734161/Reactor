/**
 * sharemer.com Inc.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package com.lxb.reactor.client;

/**
 * @author sunqinwen
 * @version \: ServerMain.java,v 0.1 2019-03-29 15:50
 */
public class ClientMain {

    public static void main(String[] args) {
        new Thread(new Client("127.0.0.1", 2333)).start();
        new Thread(new Client("127.0.0.1", 2333)).start();
    }

}
