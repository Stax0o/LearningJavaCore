package collections;

public class MyArrayList {
    private String[] array = new String[3];
    private int size = 0;

    public void getSize() {
        System.out.println(String.format("%d : %d", size, array.length));
    }

    public void Add(String item) {
        array[size] = item;
        size++;
        if (size == array.length) {
            String[] temp = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
    }

    public void Remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("Елемент не найден");
        }
    }

    public void Remove(String item) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Remove(index);
        }
    }

    public void ShowArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
