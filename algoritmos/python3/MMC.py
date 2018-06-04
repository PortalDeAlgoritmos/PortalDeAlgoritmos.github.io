G = int(input("Digite o valor de G: "))
L = int(input("Digite o valor de L: "))

if G > L:
    maior = G
else:
    maior = L
while True:
    if maior % G == 0 and maior % L == 0:
        print(maior)
        break
    else:
        maior += 1