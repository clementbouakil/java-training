public class ArrayTraining {

    /**
     * @param n size of the array, ie: 3
     * @return an empty int array of size n, ie: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {

        return new int[n];
    }

    /**
     * @param n size of the array, ie: 2
     * @return an empty String array of size n, ie: {null, null}
     */
    public String[] emptyStringArray(int n) {

        return new String[n];
    }

    /**
     * @param a first value, ie: 3
     * @param b second value, ie: 2
     * @param c third value, ie: 1
     * @return an int array with a, b and c values, ie: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {

        int[] solution = {a, b, c};

        return solution;
        
    }

    /**
     * @param a first value, ie: "test"
     * @param b second value, ie: "sample"
     * @param c third value, ie: "value"
     * @return an int array with a, b and c values,
     * ie: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {

        String[] solution = {a, b , c};

        return solution;
    }

    /**
     * @param array, ie: {1, 2, 3}
     * @return length of the array, ie: 1
     */
    public int length(int[] array) {

        return array.length;
    }

    /**
     * @param array, ie: {3, 2, 1}
     * @return first value of the array, ie: 3
     */
    public int firstValue(int[] array) {

        return array[0];
    }

    /**
     * @param array, ie: {3, 2, 1}
     * @return last value of the array, ie: 1
     */
    public int lastValue(int[] array) {

        return array[length(array) - 1];
    }

    /**
     * @param array,    ie: {3, 2, 1}
     * @param position, ie: 1
     * @return value of the array at position, ie: 2
     */
    public int valueAtPosition(int[] array, int position) {

        return array[position];
    }

    /**
     * @param array,    ie: {3, 8, 5}
     * @param value,    ie: 4
     * @param position, ie: 1
     * @return the array with the value replaced at position, ie: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {

        array[position] = value;

        return array;
    }

    /**
     * @param array, ie: {1, 2, 3}
     * @return sum of values of the array, ie: 6
     */
    public int sum(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            count += array[i];
            
        }

        return count;
    }

    /**
     * @param array,  ie: {1, 2, 3}
     * @param search, ie: 2
     * @return if array contains searched value, ie: true
     */
    public boolean contains(int[] array, int search) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == search) {

                return true;
            }
        }

        return false;
    }

    /**
     * @param array, ie: {"sample", "value"}
     * @return array where all words are capitalized, ie: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] = StringTraining.capitalize(array[i]);
        }

        return array;
    }

    /**
     * @param first,  ie: {1, 2, 3}
     * @param second, ie: {3, 2, 1}
     * @return if values in first and second arrays, in the same position,
     * are equals, ie: false
     */
    public boolean equals(int[] first, int[] second) {

        boolean isSame = true;
        int length = length(first);
        int index = 0;

        while(isSame && (index<length)) {

            if (first[index] != second[index]) {

                return false;
            }

            index++;
        }

        return isSame;
    }

    /**
     * @param array, ie: {1, 2, 3}
     * @return array with reversed values, ie: {3, 2, 1}
     */
    public int[] reverse(int[] array) {

        int temp;

        for (int i = 0; i < array.length / 2; i++) { 

            temp = array[i]; 
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }

    /**
     * @param first,  ie: {1, 2, 3}
     * @param second, ie: {4, 5}
     * @return concatenates first and second values in one array,
     * ie: {1, 2, 3, 4, 5}
     */
    public int[] concat(int[] first, int[] second) {

        int firstLength = length(first);
        int secondLength = length(second);
        int[] both = new int [firstLength + secondLength];

        for (int i = 0; i < firstLength; i++) {

            both[i] = first[i];
        }

        for (int i = 0; i < secondLength; i++) {

            both[i + firstLength] = second[i];
        }

        return both;

    }
}
