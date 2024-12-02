class Solution:
    def countValidSelections(self, nums: List[int]) -> int:
        total_sum = sum(nums)
        left_sum = 0
        valid = 0
        
        for num in nums:
            if num == 0:
                if 2 * left_sum == total_sum:
                    valid +=2
                elif abs(2 * left_sum - total_sum) == 1:
                    valid +=1
                    
            else:
                left_sum  += num
                
                
                
                
        return valid