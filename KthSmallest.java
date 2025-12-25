import java.util.*;

public class KthSmallest {

    // kth smallest element খোঁজার মেথড
    public static int findKthSmallest(ArrayList<Integer> list, int k) {

        // PriorityQueue (min heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.addAll(list);   // সব element heap এ ঢুকালাম

        int result = -1;
        for(int i = 0; i < k; i++) {
            result = pq.poll();   // একে একে smallest remove হবে
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7); arr.add(10); arr.add(4);
        arr.add(3); arr.add(20); arr.add(15);

        int k = 3;
        System.out.println("3rd smallest element: " + findKthSmallest(arr, k));
    }
}
