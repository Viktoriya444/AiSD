package SEMESTROVKA_1;

public class SimpleBenchmark {
    public static void main(String[] args) {
        System.out.println("Size\tInsertMs\tExtractMs\tFindMinMs");

        for (int size = 100; size <= 10000; size += 200) {
            // Генерация данных
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = (int) (Math.random() * 1_000_000);
            }

            // ---- Вставка ----
            BinomialHeap heap = new BinomialHeap();
            long startInsert = System.nanoTime();
            for (int val : data) heap.insert(val);
            long endInsert = System.nanoTime();
            double insertMs = (endInsert - startInsert) / 1_000_000.0;

            // ---- Поиск минимума ----
            long startFind = System.nanoTime();
            heap.findMin();
            long endFind = System.nanoTime();
            double findMs = (endFind - startFind) / 1_000_000.0;

            // ---- Удаление всех ----
            long startExtract = System.nanoTime();
            while (!heap.isEmpty()) heap.extractMin();
            long endExtract = System.nanoTime();
            double extractMs = (endExtract - startExtract) / 1_000_000.0;

            // Вывод
            System.out.printf("%d\t%.3f\t%.3f\t%.3f\n", size, insertMs, extractMs, findMs);
        }
    }
}