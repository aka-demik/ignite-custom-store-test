package ru.aka;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;

public class Main {

    public static void main(String[] args) {
        try (Ignite ignite = Ignition.start("ignite-config.xml")) {
            IgniteCache<String, String> testCache = ignite.cache("test");
            testCache.loadCache(null);

            System.out.println();
            System.out.println("We expect 'key' value: 'new value'");
            System.out.printf("We got 'key' value: '%s'%n%n", testCache.get("key"));
        }
    }
}
