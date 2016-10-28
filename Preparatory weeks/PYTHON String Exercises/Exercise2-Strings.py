number = input ('Please enter binary number: ')
while len(number) != 8 :
     print ('Invalide number.')
     number = input ('Please enter again binary number: ')
sum=0
for i in range (0,7):
    sum = sum + int(number[i])
if sum % 2 == 1:
   print ('Parity check OK')
else :
   print ('Parity check not OK')
