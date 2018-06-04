B=int(input("Digite o valor de B:   "))
L=int(input("Digite o valor de L:   "))
mdc=1
if B > L:
    G = B
else:
    G = L
for i in range(1,G):
    if B%i==0 and L%i ==0:
        mdc=i
print (mdc)