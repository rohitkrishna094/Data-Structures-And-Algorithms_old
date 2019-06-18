'''
This program is to rotate an array by k elements
'''


''' doesnt work with negative values'''


def rotate(myArray, k):
    for i in range(k):
        rotateOne(myArray)
    return myArray


def rotateOne(myArray):
    for i in range(len(myArray) - 1):
        myArray[i], myArray[i+1] = myArray[i+1], myArray[i]


k = 11
l = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
print(l)
r = rotate(l, k)
print(r)

# a better efficient algorithm but with extra space


def rotateBetter(lst, k):
    output = [0] * len(lst)  # this is how you init list of size n
    for i in range(len(lst)):
        output[(i - k) % len(lst)] = lst[(i+k) % len(lst)]
    return output


print("---------rotate better---------------")
l = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
print(l)
# slicing option doesnt work for k greater than len(l)
print(l[k:] + l[:k])
r = rotateBetter(l, k)
print(r)
