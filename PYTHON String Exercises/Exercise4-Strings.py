number = input ('Please enter a 9-digit number: ')
for i in range (0,9,3) :
         print (number[i] , end= ' ')
for i in range (1,9,3) :
         if i==1:
            print ('\n',number[i] , end= ' ')
         else:
            print (number[i] , end= ' ')
for i in range (2,9,3) :
         if i==2:
            print ('\n','',number[i] , end= ' ')
         else:
            print (number[i] , end= ' ')
