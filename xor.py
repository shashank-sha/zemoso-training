import string
import itertools

cases = string.lowercase
keys = [_ for _ in itertools.product(range(97,123), repeat = 3)]


def decrypt(code, password):
    l = len(password)
    return tuple(c ^ password[i % l] for i, c in enumerate(code))

cipher_file = open('_xor.txt', 'r')
cipher_lines = []
for i in cipher_file.readlines():
    line = i.strip()
    line = map(int, i.split(','))
    cipher_lines = line

for i in range(len(cipher_lines)-2):
    for j in keys:
        if cipher_lines[i]^j[0] == 116 or  cipher_lines[i]^j[0] == 84:
            if cipher_lines[i+1]^j[1] == 104 or cipher_lines[i+1]^j[1] == 72:
                if cipher_lines[i+2]^j[2] == 101 or cipher_lines[i+2]^j[2] == 69 :
                    print "Key is ",''.join(chr(_) for _ in j)
                    t = decrypt(cipher_lines, j)
                    y = ''.join(chr(c) for c in t)
                    print y
                    if raw_input() == 'y':
                        print sum(t)
                        exit()
