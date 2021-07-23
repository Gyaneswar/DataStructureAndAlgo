class BIT {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryIndexedTree tree = new BinaryIndexedTree(array);
        System.out.println(tree.sum(5));    
        tree.update(5, 0);
        System.out.println(tree.sum(5));    
    }
}

class BinaryIndexedTree {
    private int[] a;
    private int n;
    public BinaryIndexedTree(int[] array) {
        n = array.length;
        a = new int[n + 1];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            create(i, array[i-1]);
        }
    }

    public void create(int index, int value) {
        while (index < a.length) {
            a[index] += value;
            index += index & (-index);
        }
    }

    public void update( int index, int value) {
        value=value-a[index];
        while (index < a.length) {
            a[index] += value;
            index += index & (-index);
        }
    }

    public int sum(int index) {
        int sum = 0;
        while (index > 0) {
            sum += a[index];
            index -= index & (-index);
        }
        return sum;
    }

    public int sum(int from, int to) {
        return sum(to) - sum(from - 1);
    }
}
