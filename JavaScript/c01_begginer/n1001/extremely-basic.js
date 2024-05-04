const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const A = parseInt(lines[0], 10);
const B = parseInt(lines[1], 10);

const X = (A + B);

console.log(`X = ${X}`);
