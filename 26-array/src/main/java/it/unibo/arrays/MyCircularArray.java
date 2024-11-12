package it.unibo.arrays;

class MyCircularArray {

    int[] array;
    int prossimo = 0;

    MyCircularArray() {
        this.array = new int[10];
        reset();
    }

    MyCircularArray(int size) {
        this.array = new int[size];
        reset();
    }

    void add(final int elem) {
        this.array[prossimo] = elem;
        prossimo++;
        if(prossimo == array.length) {
            prossimo = 0;
        }
    }

    void reset() {
        for(int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {

        // 1) Creare un array circolare di dieci elementi
        MyCircularArray a1 = new MyCircularArray();
        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(9);
        a1.add(10);
        a1.printArray();
        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare
        a1.add(11);
        a1.add(12);
        a1.add(13);
        a1.add(14);
        a1.add(15);
        a1.printArray();
        // 4) Invocare il metodo reset
        a1.reset();
        // 5) Stampare il contenuto dell'array circolare
        a1.printArray();
        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
        a1.printArray();
    }
}
