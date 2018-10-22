let Stack = require('./Stack_Array');

const s = new Stack();

s.push('java');
s.push('c');
s.push('python');

console.log('\n' + s.peek());
console.log(s.pop());
console.log(s.isEmpty());
console.log(s.size());

console.log('\n' + s.peek());
console.log(s.pop());
console.log(s.isEmpty());
console.log(s.size());

console.log('\n' + s.peek());
console.log(s.pop());
console.log(s.isEmpty());
console.log(s.size());

s.push('java');
s.push('c');
s.push('python');

console.log('\n' + s.size());
s.clear();
console.log(s.size());
