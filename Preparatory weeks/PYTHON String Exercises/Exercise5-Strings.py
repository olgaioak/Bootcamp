import math
import calendar
y = input ('Please enter a year: ')
calendar.isleap(int(y))
a = int(y) % 4
b = int(y) % 7
c = int(y) % 19
d = (19*c + 15) % 30
e = (2*a + 4*b - d + 34) % 7
month = math.floor((d + e +114)/ 31)
day = ((d + e + 114) % 31) + 1
day = day + 13
if (month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12) and day > 31:
    month = month + 1
    day = day - 31
elif (month == 4 or month == 6 or month == 9 or month == 11) and day > 30:
    month = month + 1
    day = day - 30
if month == 2 and calendar.isleap(int(y)) and day>29:
    day = day - 29
    month = month + 1
elif month == 2 and day >28:
    day = day - 28
    month = month + 1
print ('Enter year:' , int(y))
print ('Day:' , day , 'Month:' , month)
    
