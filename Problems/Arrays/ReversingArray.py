'''
    This is a program to reverse an array or list
'''


def reverse(lst):
    return lst.reverse()


# using built in lib functions
l = list([1, 2, 3, 4])
r = list(reversed(l))
print(l, r)

# lst[::-1] # another way to reverse using slicing


# without using built in functions
def reverse_mine(lst):
    endIndex = len(lst) - 1
    for i in range(0, len(lst) // 2):
        temp = lst[i]
        lst[i] = lst[endIndex]
        lst[endIndex] = temp
        endIndex -= 1


l = list([1, 2, 3, 4, 5])
print(l, end=' ')
reverse_mine(l)
print(l)


# a more refined approach found online
def reverseAnArray(myArray, start, end):
    while(start < end):
        myArray[start], myArray[end - 1] = myArray[end - 1], myArray[start]
        start += 1
        end -= 1


l = list([1, 2, 3, 4, 5, 6])
print(l, end=' ')
reverseAnArray(l, 0, len(l))
print(l)
