package com.imooc;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by tl on 2019/3/3.
 */
public class redisServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(6378);
            Socket socket = serverSocket.accept();
            byte[] bytes = new byte[1024];

            InputStream in = socket.getInputStream();
            in.read(bytes);




        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
