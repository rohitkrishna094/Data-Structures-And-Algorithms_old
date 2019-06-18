'''
# Given an array of positive integers. All numbers occur even number of times except one
# number which occurs odd number of times. Find the number in O(n) time & constant space.

# XOR of all elements gives us odd occurring element. Please note that XOR of two elements
# is 0 if both elements are same and XOR of a number x with 0 is x.

'''


def printOddOccurences(arr):
    odd = 0
    for elem in arr:
        odd = odd ^ elem
    return odd


arr = [3, 4, 1, 2, 4, 1, 2, 5, 6, 4, 6, 5, 3]
print(printOddOccurences(arr))  # 4
