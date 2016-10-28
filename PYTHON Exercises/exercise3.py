import math
a = input ('Enter the first side of the triangle: ')
b = input ('Enter the second side of the triangle: ')
c = input ('Enter the third side of the triangle: ')
a = int(a)
b = int(b)
c = int(c)
d = (1/4) * math.sqrt((a+b+c)*(b-a+c)*(a-b+c)*(a+b-c))
print (d)
