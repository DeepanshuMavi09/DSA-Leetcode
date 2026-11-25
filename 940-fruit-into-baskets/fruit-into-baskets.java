import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int k = 2;

        HashMap<Integer , Integer> basket = new HashMap<>();
        int left = 0;
        int maxFruit = 0;

        for (int right = 0; right < fruits.length; right ++){
            int rightFruit = fruits[right];
            basket.put(rightFruit, basket.getOrDefault(rightFruit,0)+1);

            while(basket.size()> k){
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit)-1);

                if(basket.get(leftFruit)== 0){
                    basket.remove(leftFruit);
                }
                left++;
            }
            maxFruit = Math.max(maxFruit, right-left+1);
        }

        return maxFruit;
    }
}