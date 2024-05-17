const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const PI = 3.14159;
const radius = parseFloat(lines[0], 10);

const volume = (4.0/3) * PI * (radius ** 3);

console.log(`VOLUME = ${volume.toFixed(3)}`);
