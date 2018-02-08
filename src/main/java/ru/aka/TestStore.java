package ru.aka;

import org.apache.ignite.cache.store.CacheStore;
import org.apache.ignite.lang.IgniteBiInClosure;
import org.jetbrains.annotations.Nullable;

import javax.cache.Cache;
import javax.cache.integration.CacheLoaderException;
import javax.cache.integration.CacheWriterException;
import java.util.Collection;
import java.util.Map;

public class TestStore implements CacheStore<String, String> {
    public void loadCache(IgniteBiInClosure<String, String> clo, @Nullable Object... args) throws CacheLoaderException {
        clo.apply("key", "old value");
        clo.apply("key", "new value");
    }

    public void sessionEnd(boolean commit) throws CacheWriterException {
    }

    public String load(String key) throws CacheLoaderException {
        return null;
    }

    public Map<String, String> loadAll(Iterable<? extends String> keys) throws CacheLoaderException {
        return null;
    }

    public void write(Cache.Entry<? extends String, ? extends String> entry) throws CacheWriterException {
    }

    public void writeAll(Collection<Cache.Entry<? extends String, ? extends String>> entries) throws CacheWriterException {
    }

    public void delete(Object key) throws CacheWriterException {
    }

    public void deleteAll(Collection<?> keys) throws CacheWriterException {
    }
}
