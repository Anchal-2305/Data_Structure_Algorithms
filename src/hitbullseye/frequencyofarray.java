package hitbullseye;

public class frequencyofarray {
      public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 1, 4, 2};
            int n = arr.length;
            boolean[] visited = new boolean[n];
            System.out.println("Element | Frequency");
            for (int i = 0; i < n; i++) {
                if (visited[i])
                    continue;
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println("   " + arr[i] + "    |    " + count);
            }
        }
    }

