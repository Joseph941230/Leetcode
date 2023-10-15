class Solution(object):
    def maximumUnits(self, boxTypes, truckSize):
        """
        :type boxTypes: List[List[int]]
        :type truckSize: int
        :rtype: int
        """
        
        boxTypes.sort(key=lambda x: x[1], reverse=True)
        count = 0 
        units = 0
        for i in boxTypes:
            if i[0] <= truckSize - count:
                count += i[0]
                units += i[0] * i[1]
            else:
                units += (truckSize - count) * i[1]
                break
            
        return units
        