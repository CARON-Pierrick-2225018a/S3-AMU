substitution = "xnyahpogzqwbtfsflrcvmiuekjdi"
alphabet = "abcdefghijklmnopqrstuvwxyz"


def codage_substitution(texte, substitution):
    resultat = ''
    for char in texte:
        if 'a' <= char <= 'z':  # si le caractère est une lettre minuscule
            index = alphabet.find(char)
            resultat += substitution[index]
        else:
            resultat += char

    return resultat

def decodage_substitution(code, substitution) :
    decodage = ''
    for char in code :
        if 'a' <= char <= 'z' :
            index = substitution.find(char)
            decodage += alphabet[index]
        else:
            decodage += char

    return decodage



# Test
texte = "bonjour"
print(codage_substitution(texte, substitution))

# Test decodage

code = "nsfqsmr"
print (decodage_substitution(code, substitution))