import requests

x = requests.get("http://localhost:8989/Users")
print(x.text)

while(True):
    print("\n 1. Afficher tous les produits\n q. Quitter\n")
    
    choix = input("Que voulez vous faire ? ")
    
    if choix=="1":
        x = requests.get("http://localhost:8989/produit")
        print(x.text)
    
    elif choix=="q":
        break
    else:
        print("Entrez un choix valide ")
