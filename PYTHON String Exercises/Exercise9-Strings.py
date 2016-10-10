import string
shift = input ('Please enter number of position shift: ')
phrase = input ('Please enter a phrase: ')
for i in range(0, len(phrase)):
    for char in string.ascii_uppercase:
        if char == phrase[i]:
            x=ord(char) + int(shift)
            if x>90:
                print(chr(x-26), end="")
            else:
                print(chr(x), end="")
