package it.unibo.arrays;

import java.util.*;

class WorkWithArrays {

    static int countOccurrencies(final int[] array, final int element) {
        int occurrencies = 0;
        for (final int currentElement : array) {
            if (currentElement == element) {
                occurrencies++;
            }
        }
        return occurrencies;
    }

    static int[] evenElements(final int[] array) {
        int[] ris;
        int j = 0;
        if(array.length % 2 == 0) {
            ris = new int[array.length / 2];
        } else {
            ris = new int[array.length / 2 + 1];
        }
        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                ris[j] = array[i];
                j++;
            }
        }
        return ris;
    }

    static int[] oddElements(final int[] array) {
        int[] ris;
        int j = 0;
        ris = new int[array.length / 2];
        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 1) {
                ris[j] = array[i];
                j++;
            }
        }
        return ris;
    }

    static int mostRecurringElement(final int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        int maggiore;
        for (int i : array) {
            if(map.containsKey(i)) {
                map.replace(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        maggiore=map.keySet().iterator().next();
        for (int i : map.keySet()) {
            if(map.get(maggiore) < map.get(i)) {
                maggiore = i;
            }
        }
        return maggiore;
    }

    static int[] sortArray(final int[] array, final boolean isDescending) {
        int[] ris = array;
        if(isDescending == false) {
            for(int i = ris.length - 1; i >=0; i--) {
                for(int j = 0; j < i; j++) {
                    if(ris[j] > ris[j+1]) {
                        int temp = ris[j+1];
                        ris[j+1] = ris[j];
                        ris[j] = temp;
                    }
                }
            }
        } else {
            for(int i = ris.length - 1; i >=0; i--) {
                for(int j = 0; j < i; j++) {
                    if(ris[j] < ris[j+1]) {
                        int temp = ris[j+1];
                        ris[j+1] = ris[j];
                        ris[j] = temp;
                    }
                }
            }
        }
        return ris;
    }

    static double computeVariance(final int[] array) {
        double media = 0;
        for (int i : array) {
            media = media + i;
        }
        media=media/array.length;
        double[] listaScarti = new double[array.length];
        for(int i = 0; i < array.length; i++) {
            double temp = Math.abs(media-array[i]);
            listaScarti[i] = temp*temp;
        }
        double varianza = 0;
        for (double d : listaScarti) {
            varianza = varianza + d;
        }
        varianza = varianza / array.length;
        return varianza;
    }

    static int[] revertUpTo(final int[] array, final int element) {
        int index = 0;
        int[] ris = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) {
                index = i;
                break;
            }
        }
        for(int i = index; i >= 0; i--) {
            ris[index - i] = array[i];
        }
        for(int i = index+1; i < array.length; i++) {
            ris[i] = array[i];
        }
        return ris;
    }

    static int[] duplicateElements(final int[] array, final int times) {
        final int[] returnValue = new int[array.length * times];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < times; j++) {
                returnValue[i * times + j] = array[i];
            }
        }
        return returnValue;
    }

    /** Testing methods **/

    /* Utility method for testing countOccurr method */
    static boolean testCountOccurrencies() {
        return countOccurrencies(new int[] { 1, 2, 3, 4 }, 1) == 1
            && countOccurrencies(new int[] { 0, 2, 3, 4 }, 1) == 0
            && countOccurrencies(new int[] { 7, 4, 1, 9, 3, 1, 5 }, 2) == 0
            && countOccurrencies(new int[] { 1, 2, 1, 3, 4, 1 }, 1) == 3;
    }

    static boolean testCountOccurrencies2() {
        return countOccurrencies(new int[] { 1, 2, 3, 4 }, 1) == 1
            && countOccurrencies(new int[] { 0, 2, 3, 4 }, 1) == 0
            && countOccurrencies(new int[] { 7, 4, 1, 9, 3, 1, 5 }, 2) == 0
            && countOccurrencies(new int[] { 1, 2, 1, 3, 4, 1 }, 1) == 3;
    }

    /* Utility method for testing evenElems method */
    static boolean testEvenElements() {
        return Arrays.equals(evenElements(new int[] { 1, 2, 3, 4 }), new int[] { 1, 3 })
            && Arrays.equals(evenElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }), new int[] { 1, 3, 5, 7, 9 })
            && Arrays.equals(evenElements(new int[] { 4, 6, 7, 9, 1, 5, 23, 11, 73 }), new int[] { 4, 7, 1, 23, 73 })
            && Arrays.equals(
                evenElements(new int[] { 7, 5, 1, 24, 12, 46, 23, 11, 54, 81 }),
                new int[] { 7, 1, 12, 23, 54 }
        );
    }

    /* Utility method for testing oddElems method */
    static boolean testOddElements() {
        return Arrays.equals(oddElements(new int[] { 1, 2, 3, 4 }), new int[] { 2, 4 })
            && Arrays.equals(oddElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }), new int[] { 2, 4, 6, 8 })
            && Arrays.equals(oddElements(new int[] { 4, 6, 7, 9, 1, 5, 23, 11, 73 }), new int[] { 6, 9, 5, 11 })
            && Arrays.equals(
                oddElements(new int[] { 7, 5, 1, 24, 12, 46, 23, 11, 54, 81 }),
                new int[] { 5, 24, 46, 11, 81 }
            );
    }

    /* Utility method for testing getMostRecurringElem method */
    static boolean testMostRecurringElement() {
        return mostRecurringElement(new int[] { 1, 2, 1, 3, 4 }) == 1
            && mostRecurringElement(new int[] { 7, 1, 5, 7, 7, 9 }) == 7
            && mostRecurringElement(new int[] { 1, 2, 3, 1, 2, 3, 3 }) == 3
            && mostRecurringElement(new int[] { 5, 11, 2, 11, 7, 11 }) == 11;
    }

    /* Utility method for testing sortArray method */
    static boolean testSortArray() {
        return Arrays.equals(sortArray(new int[] { 3, 2, 1 }, false), new int[] { 1, 2, 3 })
            && Arrays.equals(sortArray(new int[] { 1, 2, 3 }, true), new int[] { 3, 2, 1 })
            && Arrays.equals(
                sortArray(new int[] { 7, 4, 1, 5, 9, 3, 5, 6 }, false),
                new int[] { 1, 3, 4, 5, 5, 6, 7, 9 }
            );
    }

    /* Utility method for testing computeVariance method */
    static boolean testComputeVariance() {
        return computeVariance(new int[] { 1, 2, 3, 4 }) == 1.25
            && computeVariance(new int[] { 1, 1, 1, 1 }) == 0
            && computeVariance(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }) == 8.25;
    }

    /* Utility method for testing revertUpTo method */
    static boolean testRevertUpTo() {
        return
            Arrays.equals(
                revertUpTo(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5),
                new int[] { 5, 4, 3, 2, 1, 6, 7, 8, 9, 10 }
            )
            && Arrays.equals(
                revertUpTo(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 3),
                new int[] { 3, 2, 1, 4, 5, 6, 7, 8, 9, 10 }
            )
            && Arrays.equals(
                revertUpTo(new int[] { 1, 2, 3 }, 3),
                new int[] { 3, 2, 1 }
            );
    }

    /* Utility method for testing dupElems method */
    static boolean testDuplicateElements() {
        return Arrays.equals(duplicateElements(new int[] { 1, 2, 3 }, 2), new int[] { 1, 1, 2, 2, 3, 3 })
            && Arrays.equals(duplicateElements(new int[] { 1, 2 }, 5), new int[] { 1, 1, 1, 1, 1, 2, 2, 2, 2, 2 });
    }

    public static void main(final String[] args) {
        System.out.println("testCountOccurr: " + testCountOccurrencies());
        System.out.println("testEvenElems: " + testEvenElements());
        System.out.println("testOddElems: " + testOddElements());
        System.out.println("testGetMostRecurringElem: " + testMostRecurringElement());
        System.out.println("testSortArray: " + testSortArray());
        System.out.println("testComputeVariance: " + testComputeVariance());
        System.out.println("testRevertUpTo: " + testRevertUpTo());
        System.out.println("testDupElems: " + testDuplicateElements());
        System.out.println("test2"+testCountOccurrencies2());
    }
}
