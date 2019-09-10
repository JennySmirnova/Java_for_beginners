package Task15;

//Необходимо написать программу для сортировки данных массива по возрастанию.
//Использовать пузырьковый метод сортировки.
public class Task15 {
    public static void main(String[] args) {

        int mass[] = {23, 88, 55, 71, 98, 102, 254, 12, 10, 1};
        bubbleSort(mass);
    }

    public static void bubbleSort(int[] mass) {
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int a = mass[j];
                    mass[j] = mass[j + 1];
                   mass[j + 1] = a;
                }
            }
        }

        for (int i = 0; i < mass.length; i++)
        System.out.println("Элемент["+ i +"]:" + mass[i]);
    }
}

