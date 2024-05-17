const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const [A, B, C] = lines.shift().split(' ').map(Number);

const PI = 3.14159;

const triangleArea = (A * C) / 2;
const circleArea = PI * (C ** 2);
const trapeziumArea = ((A + B) * C) / 2;
const squareArea = B ** 2;
const rectangleArea = A * B;

console.log(
  `TRIANGULO: ${triangleArea.toFixed(3)}\n` +
  `CIRCULO: ${circleArea.toFixed(3)}\n` +
  `TRAPEZIO: ${trapeziumArea.toFixed(3)}\n` +
  `QUADRADO: ${squareArea.toFixed(3)}\n` +
  `RETANGULO: ${rectangleArea.toFixed(3)}`
);
