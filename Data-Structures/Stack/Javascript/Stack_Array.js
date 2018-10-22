// Stack implementation based on array
class Stack_Array {
  constructor() {
    this.items = [];
  }

  push(element) {
    this.items.push(element);
  }

  pop() {
    return this.items.pop();
  }

  peek() {
    const length = this.items.length;
    return this.items[length - 1];
  }

  isEmpty() {
    return this.items == 0;
  }

  clear() {
    this.items = [];
  }

  size() {
    return this.items.length;
  }
}

module.exports = Stack_Array;
