class Stack_Object {
  constructor() {
    this.count = 0;
    this.items = {};
  }

  push(element) {
    this.items[this.count++] = element;
  }

  pop() {
    if (this.isEmpty()) return undefined;

    this.count--;
    const e = this.items[this.count];
    delete this.items[this.count];
    return e;
  }

  clear() {
    this.items = {};
    this.count = 0;
  }

  size() {
    return this.count;
  }

  isEmpty() {
    return this.count == 0;
  }

  peek() {
    if (this.isEmpty()) return undefined;
    return this.items[this.count - 1];
  }
}

module.exports = Stack_Object;
