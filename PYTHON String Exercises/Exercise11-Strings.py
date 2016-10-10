number = input ('Please enter a number: ')
flag = 1
count = 0 #metritis gia ta 10 noumera se kathe grammi
for i in range (3 , int(number) + 1):
    j = 0
    while i >= 2**j:
        if 2** j == i:
            flag=0
        else :
            flag=1
        j = j + 1
    if flag == 1:
        print (i, end = " ")
        count= count + 1
        if count == 10:
            print()
            count = 0
