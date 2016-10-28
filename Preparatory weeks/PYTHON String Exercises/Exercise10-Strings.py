number = input ('Please enter a sequence of 0s and 1s: ')
l = [0,0]
l1 = 0
l2 = 0
for y in  number:
        if y == '1':
              l1 = l1 + 1
              if l1>l[0]:
                  l[0]=l1
              l2 = 0 #midenizw to sum gia ta midenika 
        else:
              l2 = l2 + 1
              if l2>l[1]:
                 l[1]=l2
              l1 = 0

if l[0] > l[1]:
    print("Longest run was ones with length:" , l[0])
elif l[0] < l[1]:
    print("Longest run was zeros with length:" , l[1])
else:
    print("Equal longest run of ones and zeros with length:" , l[0])
