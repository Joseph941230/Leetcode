class Solution:
    def partitionString(self, s: str) -> int:
        currset = set()
        res = 1
        for i in s:
            if i in currset:
                res += 1
                currset = set()
            currset.add(i)
            
        return res
        