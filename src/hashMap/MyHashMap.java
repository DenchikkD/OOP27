package hashMap;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by Iliren on 29.09.2016.
 * * Created by Iliren on 29.09.2016.
 * Задача 2. Написать собственную реализацию MyHashMap<K, V>
 * Реализовать методы MyHashMap:
 * 1. boolean put(K, V)
 * 2. User get( K )
 * 3. int size()
 * 4. boolean remove(K key)
 * 5. MyEntry<K, V> entrySet()
 * <p>
 * Обеспечить возможность создания MyHashMap с указанием дженериком типов для "ключа" и "значения".
 * <p>
 * Наименование класса может звучать так: MyHashMap, при этом нельзя использовать HashMap или HashSet.
 * Примечание: напоминаю, что карта состоит из массива, элементами которого являются односвязанные списки.
 * <p>
 * Для хранения пары значений рекомендую создать класс MyEntry c двумя полями соответсвенно для ключа key и значения value.
 */
public class MyHashMap<K, V> extends MyAbstractHashMap<K, V> implements MyMap<K, V> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private MyEntry<K, V>[] arr;
    private int size = 0;


    public MyHashMap() {
        arr = (MyEntry<K, V>[]) new MyEntry[DEFAULT_INITIAL_CAPACITY];

    }

    @Override
    public boolean put(K key, V element) {
        int idx = hash(key) % (arr.length - 1);
        if (arr[idx] == null) {
            arr[idx] = new MyEntry<K, V>(key.hashCode(), key, element, null);
        } else {
            MyEntry<K, V> entry = new MyEntry<K, V>(hash(key), key, element, null);
            MyEntry<K, V> position = arr[idx];
            while (position.next != null) {
                if (position.hash == entry.hash && (position.key == entry.key || position.key.equals(entry.key))) {
                    position.value = entry.value;
                }
                position = position.next;
            }
            position.next = entry;
        }
        return true;
    }

    private int hash(K key) {
        int hash;
        if (key == null) {
            hash = 0;
        } else {
            hash = key.hashCode();
        }
        return hash;
    }


    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean remove(K key) {
        return false;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    static class MyEntry<K, V> implements MyMap.Entry<K, V> {
        final int hash;
        final K key;
        V value;
        MyEntry<K, V> next;

        public MyEntry(int hash, K key, V value, MyEntry<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public K getKey() {
            return null;
        }

        @Override
        public V getValue() {
            return null;
        }

        @Override
        public V setValue(V value) {
            return null;
        }
    }


}


