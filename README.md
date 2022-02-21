# Ing�nierie Dirig�e par les Mod�les

## Travaux Pratiques : Compilateur depuis un langage sp�cifique vers Python et R pour traiter des fichiers CSV

### R�cup�rer le projet
Un d�p�t Git est disponible � l�adresse suivante : https://github.com/StefanLocke/IDM-Projet.
La grammaire se trouve dans eclipse.idm.project.src.idm.projet.IdmDsl.xtext.
Un diagramme de classe repr�sente les possibilit�s du langage. � la racine, le fichier se nomme class diagram.jpg. 

### Le choix du langage source et des langages cibles

Parmi les diff�rentes propositions disponibles, l��quipe a choisi le traitement des donn�es �crites en Comma-Separated Values (CSV) car ce format permet une retranscription en tableau Excel, largement utilis� aujourd�hui, ce qui aide � la visualisation des objectifs. On parlera alors de cellules, de lignes et de colonnes comme des �l�ments d�un tableau Excel. Non pas que ces notions soient �trang�res au format brut d�un fichier CSV, mais plus parce que les images que l�on s�en fait sont plus claires.
Le langage source invent� dispose des fonctionnalit�s n�cessaires et souhaitables pout interagir avec ces donn�es. Que ce soient des instructions relatives aux calculs entre les cellules ou � la lecture/�criture compl�te de fichier, notre grammaire s�est voulue plut�t libre d�action, afin que nos tests soient consid�r�s comme utiles pour un outil potentiellement d�veloppable.
Les cibles choisies sont Python et R. Ces langages relativement similaires permettent l�utilisation de librairies et restent assez faciles � �crire. De plus, certains membres de l��quipe s�y sentent � l�aise.

### Moyens de test

<span style="color:red">Le programme va utiliser votre commande python. Il est donc n�cessaire d�avoir Python install� sur la machine. Si la commande est python ou python3, vous devez modifier en cons�quence la valeur situ�e dans eclipse.idm.project.tests.src.org.xtext.example.mydsl.tests.TestUtils.java. 
Il est �galement n�cessaire d�avoir install� la librairie pandas (pour la lecture de CSV). pip install pandas. Il en va de m�me pour R, sauf qu�il n�y a pas a de changement de variable pr�alable � faire.</span>

Afin de tester le bon d�roulement de la compilation et l�exactitude du d�veloppement qui y est li�, des tests ont �t� r�alis�s. Pour les effectuer il y a besoin :
-	D�un programme du langage source compil� (en Python et en R) 
-	D�un fichier CSV (si le test souhaite modifier un fichier existant)
Et en sortie nous aurons :
-	Le code Python et R apr�s 
-	Le r�sultat en CSV apr�s l�application du langage compil� (en Python et en R) 
La disposition des ressources, dans eclipse.idm.project.tests.ressources, est la suivante :

![Ressources structure giagram](ressources.png)

#### Lancer les tests

Dans un premier temps, il faut qu�Eclipse prenne en compte la grammaire et syntaxe cr��e :
-	eclipse.idm.project.src.idm.project -> GeneratedIdmDsl.mwe2 -> Run As -> MWE2 Worflow
-	eclipse.idm.project.src.idm.project -> IdmDsl.xtext -> Run As -> Generate Xtext Artifacts

Ensuite, il faut lancer les tests pour Python et R de la fa�on suivante :
-	eclipse.idm.project.tests -> PythonCompilerTest.xtend -> Run As -> Junit Test
-	eclipse.idm.project.tests -> RCompilerTest.xtend -> Run As -> Junit Test
Les tests sont ainsi ex�cut�s, et leur temps d�ex�cution est logg� dans la console.

 
### R�sultats et performances

Suite � une batterie de tests r�alis�es avec JUnit concernant les performances de la compilation du langage source vers Python, on remarque une dur�e d�ex�cution d�environ 105 millisecondes.

Les tests vers le langage R quant � eux, montrent une performance pour des test similaires sur une dur�e de XXX millisecondes. On aurait donc tendance � penser que cette compilation est plus XXX, et donc que XXX est plus int�ressant que XXX.

� ce stade, les donn�es dont nous disposons ne sont pas suffisantes pour d�finir qu�elle est la meilleure variante � utiliser. Il faudrait plus de tests, beaucoup plus, et pouvoir les lancer sur des machines dont les capacit�s physiques diff�rent (pour �viter d��tablir une affirmation uniquement gr�ce � une seule machine).
