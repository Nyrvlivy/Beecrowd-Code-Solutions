const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const employeeName = lines[0];
const fixedSalary = (parseFloat(lines[1]));
const totalSales = (parseFloat(lines[2]));

const totalSalary = fixedSalary + (totalSales * 0.15);

console.log(`TOTAL = R$ ${totalSalary.toFixed(2)}`);
