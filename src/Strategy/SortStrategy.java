package Strategy;

import java.util.Arrays;

public class SortStrategy implements FindStrategy{
    @Override
    public int largest(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}
