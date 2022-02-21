# Ingénierie Dirigée par les Modèles

## Travaux Pratiques : Compilateur depuis un langage spécifique vers Python et R pour traiter des fichiers CSV

### Récupérer le projet
Un dépôt Git est disponible à l’adresse suivante : https://github.com/StefanLocke/IDM-Projet.
La grammaire se trouve dans eclipse.idm.project.src.idm.projet.IdmDsl.xtext.
Un diagramme de classe représente les possibilités du langage. À la racine, le fichier se nomme class diagram.jpg. 

### Le choix du langage source et des langages cibles

Parmi les différentes propositions disponibles, l’équipe a choisi le traitement des données écrites en Comma-Separated Values (CSV) car ce format permet une retranscription en tableau Excel, largement utilisé aujourd’hui, ce qui aide à la visualisation des objectifs. On parlera alors de cellules, de lignes et de colonnes comme des éléments d’un tableau Excel. Non pas que ces notions soient étrangères au format brut d’un fichier CSV, mais plus parce que les images que l’on s’en fait sont plus claires.
Le langage source inventé dispose des fonctionnalités nécessaires et souhaitables pout interagir avec ces données. Que ce soient des instructions relatives aux calculs entre les cellules ou à la lecture/écriture complète de fichier, notre grammaire s’est voulue plutôt libre d’action, afin que nos tests soient considérés comme utiles pour un outil potentiellement développable.
Les cibles choisies sont Python et R. Ces langages relativement similaires permettent l’utilisation de librairies et restent assez faciles à écrire. De plus, certains membres de l’équipe s’y sentent à l’aise.

### Moyens de test
<span style="color:red">Le programme va utiliser votre commande python. Il est donc nécessaire d’avoir Python installé sur la machine. Si la commande est python ou python3, vous devez modifier en conséquence la valeur située dans eclipse.idm.project.tests.src.org.xtext.example.mydsl.tests.TestUtils.java.</span>.

Afin de tester le bon déroulement de la compilation et l’exactitude du développement qui y est lié, des tests ont été réalisés. Pour les effectuer il y a besoin :
-	D’un programme du langage source compilé (en Python et en R) 
-	D’un fichier CSV (si le test souhaite modifier un fichier existant)
Et en sortie nous aurons :
-	Le code Python et R après 
-	Le résultat en CSV après l’application du langage compilé (en Python et en R) 
La disposition des ressources, dans eclipse.idm.project.tests.ressources, est la suivante :

![Ressources structure giagram](ressources.png)