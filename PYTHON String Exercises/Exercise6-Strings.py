numbers = input ('Please enter number: ')
numb = numbers.split(' ')
a= numb [0: :3]
b= numb [1: :3]
c= numb [2: :3]

for i in range (0,3):
    print (" ",a[i] , end = "|")
print ()
for i in range (0,3):
    print ("",b[i] , end = "|")
print ()
for i in range (0,3):
    print (c[i] , end = "|")
