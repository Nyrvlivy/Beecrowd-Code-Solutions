total = 0

try:
    while True:
        product = input()
        _, quantity, price = product.split()
        quantity = int(quantity)
        price = float(price)

        total += quantity * price
except EOFError:
    pass

print(f"VALOR A PAGAR: R$ {total:.2f}")
