import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] arr = new int[16];
    private int size = 0;

    @Override
    public void add(int element) {
        if (size >= arr.length) {
            int newSize = arr.length * 3 / 2 + 1;
            int[] newArr = new int[newSize];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        arr[size] = element;
        size++;
    }

    @Override
    public boolean add(int index, int element) {
        if (index > size) {
            throw new RuntimeException("Index is more than size");
        }
        if (index < 0) {
            throw new RuntimeException("Index must be natural");
        }

        if (size >= arr.length) {
            int newSize = arr.length * 3 / 2 + 1;
            int[] newArr = new int[newSize];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        if (size + 1 - index >= 0) System.arraycopy(arr, index, arr, index + 1, size + 1 - index);
        arr[index] = element;
        size++;
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i <= size; i++) {
            arr[i] = 0;
        }
        size = 0;
    }

    @Override
    public int get(int index) {
        if (index >= size) {
            throw new RuntimeException("Index is more than size");
        }
        if (index < 0) {
            throw new RuntimeException("Index must be natural");
        }
        return arr[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(int index) {
        if (index >= size) {
            throw new RuntimeException("Index is more than size");
        }
        if (index < 0) {
            throw new RuntimeException("Index must be natural");
        }
        System.arraycopy(arr, index + 1, arr, index, size - index);
        size--;
        return true;
    }

    @Override
    public boolean removeByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.arraycopy(arr, i + 1, arr, i, size - i);
                size--;
                break;
            }
        }
        return true;
    }

    @Override
    public boolean removeAllValue(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.arraycopy(arr, i + 1, arr, i, size - i);
                size--;
            }
            if (arr[i] == value) {
                i--;
            }
        }
        return true;
    }

    @Override
    public boolean set(int index, int element) {
        if (index >= size) {
            throw new RuntimeException("Index is more than size");
        }
        if (index < 0) {
            throw new RuntimeException("Index must be natural");
        }

        arr[index] = element;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size) {
            throw new RuntimeException("Index is out of range");
        }
        if (fromIndex > toIndex) {
            throw new RuntimeException("fromIndex must be less than toIndex");
        }
        int newSize = toIndex - fromIndex;
        IntList newList = new IntArrayList();
        for (int i = 0; i < newSize; i++) {
            newList.add(arr[i+ fromIndex]);
        }
        return newList;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        System.arraycopy(arr, 0, result, 0, size);
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }
}
