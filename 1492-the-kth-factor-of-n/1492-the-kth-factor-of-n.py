class Solution:
    def kthFactor(self, n: int, k: int) -> int:
        count = 0
        for i in range(1,(n//2 + 1)):
            if count > k:
                break
            if n%i == 0:
                count += 1
            if count == k:
                return i
        if count+1 == k:
            return n
        return -1

        