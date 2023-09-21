class MinStack(object):

    def __init__(self):
        self.stack=[]
        self.mini_stack=[float('inf')]

    def push(self, val):
        """
        :type val: int
        :rtype: None
        """
        self.stack.append(val)
        if val <= self.mini_stack[-1]:
            self.mini_stack.append(val)
        

    def pop(self):
        """
        :rtype: None
        """
        if self.stack[-1] == self.mini_stack[-1]:
            del self.mini_stack[-1]
        return self.stack.pop()

    def top(self):
        """
        :rtype: int
        """
        return self.stack[-1]

    def getMin(self):
        """
        :rtype: int
        """
        return self.mini_stack[-1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()