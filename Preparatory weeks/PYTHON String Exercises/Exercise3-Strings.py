number = input ('Please enter a 10-digit number: ')
for i in range (0,9) :
    if i % 2 == 0:
         print (number[i] , end= ' ')
for i in range (0, len(number)) :
    if i==1 and i % 2 == 1:
        print ('\n', number[i] , end= ' ')
    elif i % 2 == 1 and i!=1:
         print (number[i] , end= ' ')
