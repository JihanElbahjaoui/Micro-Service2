# Micro-Service2
Controle sous frome projet MicroService
1. la création du premier micro-service qui permet de gérer les clients "customer-service"

![Capture d’écran (720)](https://user-images.githubusercontent.com/104327012/209476549-c40811a5-9aca-4701-ba68-1abd2848f703.png)

![Capture d’écran (724)](https://user-images.githubusercontent.com/104327012/209476929-b7c29f1b-eff8-4bd7-95af-d231021177bf.png)


2. la création du deuxiem micro-service qui permet de gérer les produits "inventory-service"

![Capture d’écran (718)](https://user-images.githubusercontent.com/104327012/209476674-c861db49-5c05-4d65-80a3-62b5ae61a0eb.png)

![image](https://user-images.githubusercontent.com/104327012/209476973-5ffb0bed-dcd0-44af-aa00-8e5231271840.png)


3. la création de la gateway spring cloud gateway avec une configuration statique du système de routage

![Capture d’écran (719)](https://user-images.githubusercontent.com/104327012/209476763-b622d657-1a3b-42f7-b782-c249a33a8cf1.png)

ici le service gateway nous permet de consulter les clients

![Capture d’écran (730)](https://user-images.githubusercontent.com/104327012/209484148-60b46001-710c-4641-91ae-5d7931d3719a.png)

ici le service gateway nous permet de consulter les produit

![Capture d’écran (732)](https://user-images.githubusercontent.com/104327012/209484268-1af6c9ff-0c6a-4f81-8226-cc0b54deea29.png)

4. la création de l'annuaire Eureka Discrovery Service ( le service d'enregistrement )

![Capture d’écran (722)](https://user-images.githubusercontent.com/104327012/209484010-d2eedd11-4cdc-4f4c-a4f4-b2212c79ac39.png)

lorsque on consulte le service Eureka on trouve que les services customers, products et gateway sont bien enregistrer 

![Capture d’écran (734)](https://user-images.githubusercontent.com/104327012/209484478-01d9229c-30f2-4db0-9c01-fbe1b9e9f8ae.png)
