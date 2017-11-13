package in.srain.cube.objectsize;

import java.io.IOException;

public class TestSize {
    
    private int a = 1;

    public static void main(String[] args) throws IOException {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        Long a = 2L;
        for (int i = 1; i <= 30; i++) {
            a = a * 2L;
        }
        System.out.println(a);
        
        TestObject1 testObject1 = new TestObject1();
        TestObject2 testObject2 = new TestObject2();

        JustObject[] array = new JustObject[0];
        int[] intArray = new int[1];
        intArray[0] = 100;
        
        String string = new String();
        String string2 = new String("abc");

        System.out.printf("size of empty String: %s\n", ObjectSizeFetcher.getObjectSize(string));
        System.out.printf("size of abc String: %s\n", ObjectSizeFetcher.getObjectSize(string2));
        
        System.out.printf("size of array object: %s\n", ObjectSizeFetcher.getObjectSize(array));
        System.out.printf("size of array object with 1 int: %s\n", ObjectSizeFetcher.getObjectSize(intArray));
        System.out.printf("size of empty object: %s\n", ObjectSizeFetcher.getObjectSize(new JustObject()));
        System.out.printf("size of object with int: %s\n", ObjectSizeFetcher.getObjectSize(testObject1));
        System.out.printf("size of object with 2 int: %s\n", ObjectSizeFetcher.getObjectSize(testObject2));
        // System.out.printf("size of HashMapEntry: %s\n", ObjectSizeFetcher.getObjectSize(new HashMapEntry<String, String>("", "", 0, null)));
        // System.out.printf("size of SimpleHashMapEntry: %s\n", ObjectSizeFetcher.getObjectSize(new SimpleHashSetEntry<String>(0, null)));
        System.out.println("wait");
        System.in.read();
    }

    static class HashMapEntry<K, V> {
        final K key;
        final int hash;
        V value;
        HashMapEntry<K, V> next;

        HashMapEntry(K key, V value, int hash, HashMapEntry<K, V> next) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }
    }

    static class SimpleHashSetEntry<T> {

        private int mHash;
        private T mKey;
        private SimpleHashSetEntry<T> mNext;

        private SimpleHashSetEntry(int hash, T key) {
            mHash = hash;
            mKey = key;
        }
    }

    private static class TestObject1 {
        private int mInt1;
    }

    private static class TestObject2 {
        private int mInt1;
        private int mInt2;
    }
    
    private static class JustObject {
        
    }
}
