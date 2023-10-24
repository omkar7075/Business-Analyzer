/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.HashMap
 */
package a.a.a.a;

import a.a.a.a.b;
import java.util.HashMap;

public class a<K, V>
extends b<K, V> {
    private HashMap<K, b.d<K, V>> e = new HashMap();

    public boolean contains(K k2) {
        return this.e.containsKey(k2);
    }
}

