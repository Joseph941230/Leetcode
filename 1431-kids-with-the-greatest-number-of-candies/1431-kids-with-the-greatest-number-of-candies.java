class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int MaxCandies = 0;
        for (int candy : candies){
            MaxCandies = Math.max(MaxCandies, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            boolean greatCandy = (candy + extraCandies) >= MaxCandies;
            result.add(greatCandy);
        }
        return result;
    }
}