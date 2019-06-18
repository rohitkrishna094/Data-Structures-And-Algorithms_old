class Array:
    def __init__(self, sizeOfArray, arrayType=int):
        self.sizeOfArray = len(list(map(arrayType, range(sizeOfArray))))
        self.arrayItems = [arrayType(0)] * sizeOfArray
        self.arrayType = arrayType

    def __str__(self):
        return ' '.join([str(i) for i in self.arrayItems])

    def __len__(self):
        return len(self.arrayItems)

    def __setitem__(self, index, data):
        self.arrayItems[index] = data

    def __getitem__(self, index):
        return self.arrayItems[index]

    # method to search
    def search(self, keyToSearch):
        for i in range(self.sizeOfArray):
            if self.arrayItems[i] == keyToSearch:
                return i
        return -1

    # method for inserting an element
    def insert(self, keyToInsert, position):
        if self.sizeOfArray > position:
            for i in range(self.sizeOfArray - 2, position - 1, -1):
                self.arrayItems[i+1] = self.arrayItems[i]
            self.arrayItems[position] = keyToInsert
        else:
            print(f'Array size is: {self.sizeOfArray}')

    # method to delete an element
    def delete(self, keyToDelete, position):
        if self.sizeOfArray > position:
            for i in range(position, self.sizeOfArray - 1):
                self.arrayItems[i] = self.arrayItems[i+1]
            self.arrayItems[i+1] = self.arrayType(0)
        else:
            print(f'Array size is: {self.sizeOfArray}')


# Usage
a = Array(10, int)
a.insert(2, 2)
a.insert(3, 1)
a.insert(4, 7)
a.delete(4, 7)
print(len(a))
print(a)
