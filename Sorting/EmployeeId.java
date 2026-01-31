package Sorting;

public class EmployeeId {
    public static void insertionSort(int[] ids) {
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {105, 42, 78, 12, 90};
        insertionSort(employeeIDs);
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
}

