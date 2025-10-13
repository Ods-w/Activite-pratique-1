# Compte rendu du premiere partie du TP : Injection des dépendenses
#### Ce TP illustre le concept d’injection des dépendances en Java.
#### Il a été réalisé en suivant la vidéo du professeur.
#### L’objectif est de séparer la logique métier de l’accès aux données afin d’améliorer la modularité et la maintenabilité du code.
## Résultat d'exécution :
## Gestion des dépendances via instanciation statique
#### Dans cette partie, les dépendances responsables de l’accès aux données sont créées et injectées directement dans la classe métier à l’aide d’une instanciation statique.
## Version base de données
#### Autrement dit, la classe métier utilise directement une instance concrète de DaoImpl pour interagir avec la base de données.
<img width="1918" height="1020" alt="image" src="https://github.com/user-attachments/assets/4806230f-30bc-45bf-b014-51d5d92e9432" />

## Version web service 
#### Les dépendances liées à l’accès au service web sont également injectées de manière statique
<img width="1887" height="1016" alt="image" src="https://github.com/user-attachments/assets/4fa4be89-2128-443d-adac-6a2baa5532bb" />

## Résultats obtenus
####  Version Base de Données : la méthode calcul() s’exécute correctement en utilisant les données récupérées depuis la base de données, produisant le résultat attendu.
#### Version Web Service : la méthode calcul() exploite les informations fournies par le service web et affiche le résultat correspondant.
#### Ces observations démontrent que l’injection des dépendances a été réalisée avec succès et que les classes collaborent de manière cohérente, quelle que soit la source des données utilisée.

## Gestion des dépendances via instanciation dynamique
#### Dans cette partie du TP, nous avons exploré l’injection de dépendances par instanciation dynamique. Contrairement à l’instanciation statique, les objets requis sont créés au moment de l’exécution, à l’aide de la réflexion Java ou d’un conteneur IoC.
#### Cette approche rend le code plus flexible et moins dépendant des implémentations concrètes. Les classes ne sont plus directement couplées aux objets qu’elles utilisent, ce qui permet de changer facilement les dépendances sans modifier le code existant.
## Version base de données
#### La classe métier reçoit une instance de DaoImpl créée dynamiquement selon la configuration définie dans le fichier config.txt.
<img width="1907" height="1026" alt="image" src="https://github.com/user-attachments/assets/8105ee3c-fc05-467c-adfd-373bb86b8bab" />

## Version web service 
#### La classe métier reçoit une instance de ext.DoaImpl2 créée dynamiquement, également déterminée par config.txt.
<img width="1917" height="1021" alt="image" src="https://github.com/user-attachments/assets/fafcae2b-73a1-4166-9cf1-e1bd7b9d2fa4" />

## Résultats obtenus :
#### Pour la version utilisant la base de données, le programme renvoie correctement le résultat de calcul() grâce à l’implémentation dynamique associée à la base de données.
#### Pour la version via le service web, le programme produit également le résultat attendu de calcul() en s’appuyant sur l’implémentation dynamique du service web.
#### Ces tests démontrent que l’injection dynamique fonctionne efficacement, rendant le code plus modulable et facile à maintenir, sans nécessiter de modifications au niveau des classes métiers.
