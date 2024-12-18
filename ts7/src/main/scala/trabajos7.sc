// Función de integración utilizando el método de Simpson 1/3
def integracion(f: Double => Double, a: Double, b: Double): Double = {
  val x: Double = (a + b) / 2 // Punto medio entre a y b
  ((b - a) / 6) * (f(a) + 4 * f(x) + f(b)) // Fórmula del método de Simpson 1/3
}

val res: Double = integracion(x => -x * x + 8 * x - 12, 3, 5)

val res2: Double = integracion(x => 3 * x * x, 0, 2)

val res3: Double = integracion(x => x + 2 * x * x - x * x * x + 5 * math.pow(x, 4), -1, 1)

val res4: Double = integracion(x => (2 * x + 1) / (x * x + x), 1, 2)

val res5: Double = integracion(x => math.exp(x), 0, 1)

val res6: Double = integracion(x => 1 / math.sqrt(x - 1), 2, 3)

val res7: Double = integracion(x => 1 / (1 + x * x), 0, 1)

def calcularError(valorEsperado: Double, valorObtenido: Double): Double = {
  math.abs(valorEsperado - valorObtenido) // calcula el valor absoluto de la diferencia
}

val valorEsperado1: Double = 7.33
val valorEsperado2: Double = 8.0
val valorEsperado3: Double = 3.333
val valorEsperado4: Double = 1.09861
val valorEsperado5: Double = 1.71828
val valorEsperado6: Double = 0.828427
val valorEsperado7: Double = 0.785398

val error1: Double = calcularError(valorEsperado1, res)

val error2: Double = calcularError(valorEsperado2, res2)

val error3: Double = calcularError(valorEsperado3, res3)

val error4: Double = calcularError(valorEsperado4, res4)

val error5: Double = calcularError(valorEsperado5, res5)

val error6: Double = calcularError(valorEsperado6, res6)

val error7: Double = calcularError(valorEsperado7, res7)