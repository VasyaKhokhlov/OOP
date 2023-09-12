package HW6_task1;

class FibonacciServis implements IFibonacciServis {
    private IFibonacciRepository repository;

    public FibonacciServis(IFibonacciRepository repository) {
        this.repository = repository;
    }

    public long compute(int index) {
        if (index <= 0) {
            return 0;
        }

        if (index == 1 || index == 2) {
            return 1;
        }

        long fibValue = repository.get(index);
        if (fibValue != -1L) {
            return fibValue;
        }

        long fibPrev1 = compute(index - 1);
        long fibPrev2 = compute(index - 2);
        long fibCurrent = fibPrev1 + fibPrev2;

        repository.add(index, fibCurrent);
        return fibCurrent;
    }
}