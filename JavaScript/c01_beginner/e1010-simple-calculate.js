const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

let total = 0;

for (let line of lines){
  let product = line.split(" ");
  if (product.length < 3) continue;

  let quantity = parseInt(product[1], 10);
  let price = parseFloat(product[2]);

  total += quantity * price;
}

console.log(`VALOR A PAGAR: R$ ${total.toFixed(2)}`);
