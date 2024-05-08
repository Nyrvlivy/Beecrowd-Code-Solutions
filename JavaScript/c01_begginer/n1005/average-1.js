const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const A = (parseFloat(lines[0])) * 3.5;
const B = (parseFloat(lines[1])) * 7.5;

const average = (A + B) / 11;

console.log(`MEDIA = ${average.toFixed(5)}`);
