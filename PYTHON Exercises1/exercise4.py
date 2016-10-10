import math
a = input ('Enter value for a: ')
b = input ('Enter value for b: ')
c = input ('Enter value for c: ')
a = int(a)
b = int(b)
c = int(c)
if (b**2 - 4*a*c)<0 :
    print ('No real-valued solutions exist')
else :
    x = (math. sqrt (b**2 - 4*a*c) - b) / (2*a)
    y=  (-(math. sqrt (b**2 - 4*a*c)) - b) / (2*a)
    print ('The solutions of the quadratic equation are: ' , x , 'and', y)
