package test;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/**
 * Created by Administrator on 2017/11/6 0006.
 */
public class SelectorTest {

    public static void main(String[] args) throws IOException {
        Selector s = Selector.open();

        SocketChannel sc = SocketChannel.open();

        sc.configureBlocking(false);
        SelectionKey key = sc.register(s, SelectionKey.OP_ACCEPT);






    }
}
