class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        m = len(word1)
        n = len(word2)
        i=j =0
        ans = []
        while i < m or j < n:
            if i < m :
                ans.append(word1[i])
                i +=1
            if j < n :
                ans.append(word2[j])
                j +=1
                
        return ''.join(ans)
        
        
        