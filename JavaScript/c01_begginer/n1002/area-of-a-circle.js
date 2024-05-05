const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const PI = 3.14159;
const radius = parseFloat(lines[0]);

const area = PI * (radius ** 2);

console.log(`A=${area.toFixed(4)}`);
