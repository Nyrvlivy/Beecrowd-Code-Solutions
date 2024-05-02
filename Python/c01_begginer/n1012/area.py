PI = 3.14159

data = input()

A, B, C = map(float, data.split())

triangle_area = (A * C) / 2
circle_area = PI * (C ** 2)
trapezium_area = ((A + B) * C) / 2
square_area = B ** 2
rectangle_area = A * B

print(
    f"TRIANGULO: {triangle_area:.3f}\n"
    f"CIRCULO: {circle_area:.3f}\n"
    f"TRAPEZIO: {trapezium_area:.3f}\n"
    f"QUADRADO: {square_area:.3f}\n"
    f"RETANGULO: {rectangle_area:.3f}"
)
