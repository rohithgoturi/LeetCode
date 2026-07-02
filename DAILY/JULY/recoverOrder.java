public class recoverOrder {
    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int k = 0;

        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]) {
                    ans[k++] = order[i];
                    break;
                }
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] order = {3, 1, 4, 2};
        int[] friends = {1, 2, 3};
        int[] result = recoverOrder(order, friends);
        System.out.print("Recovered order: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
