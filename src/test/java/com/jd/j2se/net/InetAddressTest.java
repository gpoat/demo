package com.jd.j2se.net;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/**
 * Created by lichunran on 2018/3/2.
 */
public class InetAddressTest {

    public static void main(String[] args) throws Exception {

        InetAddress ip = InetAddress.getByName("www.jd.com");
        System.out.println(ip.isReachable(2000));
        System.out.println(ip.getHostAddress());

        InetAddress local = InetAddress.getByAddress(new byte[]{127, 0, 0, 1});
        System.out.println(local.isReachable(2000));
        System.out.println(local.getCanonicalHostName());
    }
}
