substitution = "xnyahpogzqwbtsflrcvmiuekjdi"
alphabet = "abcdefghijklmnopqrstuvwxyz"
substitutionMaj = "XNYAHPOGZQWBTSFLRCVMUEKJDI"
alphabetMAJ = "ABCDEFGHIJQLMNOPQRSTUVWXYZ"

# Question 3.1
def codage_substitution(texte, substitution):
    resultat = ''
    for char in texte:
        if 'a' <= char <= 'z' :  # si le caractère est une lettre minuscule
            index = alphabet.find(char)
            resultat += substitution[index]
        elif 'A' <= char <= 'Z' :
            index = alphabetMAJ.find(char)
            resultat += substitutionMaj[index]
        else:
            resultat += char

    return resultat

#Question 3.2
def decodage_substitution(code, substitution) :
    decodage = ''
    for char in code :
        if 'a' <= char <= 'z' :
            index = substitution.find(char)
            decodage += alphabet[index]
        elif 'A' <= char <= 'Z' :
            index = substitutionMaj.find(char)
            decodage += alphabetMAJ[index]
        else:
            decodage += char

    return decodage



# Test
print("Choisir le texte à coder : " )
texte = input()
print("Message coder : " + codage_substitution(texte, substitution))

# Test decodage

code = codage_substitution(texte, substitution)
print ( "Message décoder : " + decodage_substitution(code, substitution))