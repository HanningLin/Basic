package myList;

import myList.ArrayList.impl.ArrayListImpl;

public class Main {
    public static void main(String[] args) {
        ArrayListImpl arrayList = new ArrayListImpl();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.print();
//        arrayList.remove(2);
//        arrayList.print();
//        arrayList.set(0,3);
//        arrayList.print();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.print();

        arrayList.add(11);
        arrayList.print();

        arrayList.remove(3);
        arrayList.remove(3);
        arrayList.remove(3);
        arrayList.remove(3);
        arrayList.remove(3);
//        arrayList.remove(3);
        arrayList.print();

    }
}
