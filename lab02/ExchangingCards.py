while True:
    a, b = input().split()

    if a == "0" and b == '0':
        break

    cardsA = [int(x) for x in input().split()]
    cardsB = [int(x) for x in input().split()]
    a = set(cardsA)
    b = set(cardsB)
    aux = b
    if len(a) < len(b):
        aux = a
        a = b
    aux = [x for x in c if x not in a]
    print(len(aux))