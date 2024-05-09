const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const A = (parseFloat(lines[0]));
const B = (parseFloat(lines[1]));
const C = (parseFloat(lines[2]));

const average = ((A * 2) + (B * 3) + (C * 5)) / 10;

console.log(`MEDIA = ${average.toFixed(1)}`);
