tin = input ('Please enter TIN number: ')
while len(tin) != 9 :
     print ('Invalide number.')
     tin = input ('Please enter again TIN number: ')
check_digit = int(tin[8])
j=7
sum = 0
for i in range (1,8):
    sum = sum + int(tin[j]) * (2** i)
    j = j-1
sum = sum % 11
sum = sum % 10
if sum == check_digit:
     print ('Tax Identification Number Valid. ')
else :
     print ('Tax Identification Number not Valid. ')
