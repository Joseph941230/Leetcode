class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
    
        ans = []
        for i in range(1,n + 1):
            string = ""
            if i % 3 == 0:
                string = string +  "Fizz"
            if i % 5 == 0:
                 string = string + "Buzz"
            if string == "":
                 string = str(i)
            ans.append(string)
    
        return ans