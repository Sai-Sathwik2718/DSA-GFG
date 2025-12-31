class Solution:
    def getMinMax(self, arr):
        # code here
        arr.sort()
        a=[]
        a.append(arr[0])
        a.append(arr[-1])
        return a