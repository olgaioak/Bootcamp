s = input ('Please enter number sequence: ')
a = int(len(s))
sum = 0
if a % 2 == 0: #an einai artios
    for i in range (0, a, 2):
        sum = sum + int(s[i]) * int(s[i+1])
    print (sum)
else:
    for i in range (0, a-1, 2):
        sum = sum + int(s[i]) * int(s[i+1])
    print (sum + int(s[a-1]))
