import math
date1 = input ('Please enter the first date: ')
a1 = date1.split('/')
d1 = int(a1[0])
m1 = int(a1[1])
y1 = int(a1[2])
date2 = input ('Please enter the second date: ')
a2 = date2.split('/')
d2 = int(a2[0])
m2 = int(a2[1])
y2 = int(a2[2])
c1 = 365*y1 + math.floor(y1/4) - math.floor(y1/100) + math.floor(y1/400) + math.floor((360*m1 + 5)/10) + (d1-1)
c2 = 365*y2 + math.floor(y2/4) - math.floor(y2/100) + math.floor(y2/400) + math.floor((360*m2 + 5)/10) + (d2-1)
x = abs(c2 - c1)
print('Entered dates:' , date1 , date2 , x , 'days')