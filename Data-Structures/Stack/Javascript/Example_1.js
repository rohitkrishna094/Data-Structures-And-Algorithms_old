// Convert decimal to binary using Stack
const Stack = require('./Stack_Array');

const s = new Stack();

// input: n => number; output: res => binary representation of that number
decimalToBinary = n => {
  let result = '';

  // Fill the stack with 1's and 0's
  while (n > 0) {
    s.push(Math.floor(n % 2));
    n = Math.floor(n / 2);
    // console.log(n);
  }

  while (!s.isEmpty()) {
    result += s.pop();
  }
  return result;
};

// decimalToBinary(4);
console.log(decimalToBinary(10));
