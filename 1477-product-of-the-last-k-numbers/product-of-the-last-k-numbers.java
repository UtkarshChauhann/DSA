
class ProductOfNumbers {

    List<Integer> prefix;

    public ProductOfNumbers() {
        prefix = new ArrayList<>();
        prefix.add(1); // Initial product
    }

    public void add(int num) {
        if (num == 0) {
            // Reset because any product containing 0 is 0
            prefix.clear();
            prefix.add(1);
        } else {
            int last = prefix.get(prefix.size() - 1);
            prefix.add(last * num);
        }
    }

    public int getProduct(int k) {
        int n = prefix.size();

        // Last k numbers contain a zero
        if (k >= n) {
            return 0;
        }

        return prefix.get(n - 1) / prefix.get(n - k - 1);
    }
}
